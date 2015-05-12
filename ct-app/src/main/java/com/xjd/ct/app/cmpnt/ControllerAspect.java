package com.xjd.ct.app.cmpnt;

import java.net.URLDecoder;
import java.util.*;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.xjd.ct.app.util.HttpRequestUtil;
import com.xjd.ct.app.util.RequestContext;
import com.xjd.ct.app.view.View;
import com.xjd.ct.app.view.ViewUtil;
import com.xjd.ct.biz.bo.AppVersionResultBo;
import com.xjd.ct.biz.bo.ServiceBo;
import com.xjd.ct.biz.bo.TokenBo;
import com.xjd.ct.biz.bo.UserBo;
import com.xjd.ct.biz.service.GatewayService;
import com.xjd.ct.biz.service.UserService;
import com.xjd.ct.utl.DateUtil;
import com.xjd.ct.utl.DigestUtil;
import com.xjd.ct.utl.JsonUtil;
import com.xjd.ct.utl.constant.AppConstant;
import com.xjd.ct.utl.context.AppContext;
import com.xjd.ct.utl.enums.AppTypeEnum;
import com.xjd.ct.utl.enums.BoolEnum;
import com.xjd.ct.utl.exception.BusinessException;
import com.xjd.ct.utl.respcode.RespCode;
import com.xjd.ct.utl.valid.ValidationUtil;

@Component
@Aspect
@Order(1)
public class ControllerAspect {
	private static final Logger log = LoggerFactory.getLogger(ControllerAspect.class);

	@Autowired
	GatewayService gatewayService;
	@Autowired
	UserService userService;

	@Around("within(com.xjd.ct.app.ctrlr.*.*) && @annotation(org.springframework.web.bind.annotation.RequestMapping)")
	protected Object aroudAdivce(ProceedingJoinPoint jp) throws Throwable {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		String[] param = request.getRequestURI().split("/");
		String version = param[param.length - 2];
		String service = param[param.length - 1];
		String userIp = HttpRequestUtil.getRealRemoteAddr(request);
		String appAgent = request.getHeader("appAgent");
		if (appAgent != null) {
			appAgent = URLDecoder.decode(appAgent, "UTF-8");
		}

		RequestContext.putServiceName(service);
		RequestContext.putServiceVersion(version);
		RequestContext.putUserIp(userIp);
		RequestContext.putAppAgent(appAgent);

		String paramString = paramString(request);
		String fixLogString = "appAgent=" + appAgent + ", version=" + version + ", service=" + service + ", userIp="
				+ userIp + ", param="
				+ paramString;
		log.info("请求开始...: {}", fixLogString);
		logHeaders(request);

		View rt = null;
		long start = System.currentTimeMillis();
		try {
			// == 版本信息 == //
			parseAppAgent(appAgent);
			if (!"checkAppVersion".equals(service)) {
				AppVersionResultBo resultBo = gatewayService.checkAppVersion(RequestContext.getAppType(),
						RequestContext.getAppVersion());
				if (resultBo != null && BoolEnum.valueOfCode(resultBo.getMandatory()) == BoolEnum.TRUE) {
					throw new BusinessException(RespCode.RESP_9972);
				}
			}

			// == token == //
			String token = request.getParameter("token");
			boolean offerTokenFlag = StringUtils.isNotEmpty(token);
			TokenBo tokenBo = null;
			if (offerTokenFlag) {
				tokenBo = userService.queryTokenByToken(token);
			}

			// 先log
			gatewayService.serviceLog(userIp, tokenBo == null ? AppConstant.ANONYMOUS_USERID : tokenBo.getUserId(),
					token, service, version, DateUtil.now());

			if (!"getToken".equals(service)) {
				if (!offerTokenFlag) {
					throw new BusinessException(RespCode.RESP_0001, new Object[] { "token" });
				}
				userService.checkToken(tokenBo);
				userService.updateToken(token);
			}

			// 查询用户
			if (tokenBo != null && !AppConstant.ANONYMOUS_USERID.equals(tokenBo.getUserId())) {
				UserBo userBo = userService.queryUserByUserId(tokenBo.getUserId());
				if (userBo == null) {
					throw new BusinessException(RespCode.RESP_0110);
				}
				RequestContext.putUserId(userBo.getUserId());
			}

			// == sign == //
			if (!AppContext.isSignDisabled()) {
				String sign = request.getParameter("sign");
				if (StringUtils.isEmpty(sign)) {
					throw new BusinessException(RespCode.RESP_0010);
				}
				Map<String, String> map = new TreeMap<String, String>();
				for (Enumeration<String> enu = request.getParameterNames(); enu.hasMoreElements();) {
					String key = enu.nextElement();
					map.put(key, request.getParameter(key));
				}
				map.remove("sign");
				if (!checkSign(sign, map, tokenBo == null ? "" : tokenBo.getSalt())) {
					throw new BusinessException(RespCode.RESP_0011);
				}
			} else {
				log.debug("check sign disabled!");
			}

			// == timestamp == //
			String timestamp = request.getParameter("timestamp");
			ValidationUtil.check(ValidationUtil.TIMESTAMP, timestamp);

			// == service == //
			ServiceBo serviceBo = gatewayService.queryServiceByNameAndVersion(service, version);
			if (serviceBo == null) {
				throw new BusinessException(RespCode.RESP_9980);
			}
			if (!BoolEnum.parseCode(serviceBo.getValidFlag())) {
				throw new BusinessException(RespCode.RESP_9981);
			}
			if (BoolEnum.parseCode(serviceBo.getInMaintainFlag())) {
				throw new BusinessException(RespCode.RESP_9982, StringUtils.isBlank(serviceBo.getMaintainMsg()) ? null
						: serviceBo.getMaintainMsg());
			}
			if (BoolEnum.parseCode(serviceBo.getNeedLoginFlag())) {
				RequestContext.checkAndGetUserId();
			}

			rt = (View) jp.proceed();
		} catch (Throwable t) {
			if (t instanceof BusinessException) {
				BusinessException be = (BusinessException) t;
				rt = ViewUtil.defaultView(be.getCode(), be.getArgs(), be.getMsg(), be.getOriginalCode(),
						be.getOrginalMsg());
				if (be.getCause() != null) {
					log.error("请求异常: " + fixLogString, t);
				} else {
					log.warn("请求异常: {}, businessException={}", fixLogString, t);
				}
			} else {
				rt = ViewUtil.defaultView(RespCode.RESP_9999);
				log.error("请求异常: " + fixLogString, t);
			}
		}
		long cost = System.currentTimeMillis() - start;
		fixLogString = "[COST: " + cost + "ms]";

		if (rt == null) {
			log.info("请求返回: {}, result={}", fixLogString, null);
			return null;
		}

		rt = ViewUtil.builder(rt).service(service).version(version).timestamp(DateUtil.now()).build();
		log.info("请求返回: {}, result={}", fixLogString,
				JsonUtil.toStringIncludeIgnoredProperties(rt, DateUtil.PATTERN_YEAR2MILLISECOND));

		return rt;
	}

	protected String paramString(HttpServletRequest request) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		for (Map.Entry<String, String[]> entry : request.getParameterMap().entrySet()) {
			Object val = unarray(entry.getValue());
			if (AppContext.isEnvProduct() && AppContext.isPwdField(entry.getKey())) {
				paramMap.put(entry.getKey(), AppContext.getPwdMask());
			} else {
				paramMap.put(entry.getKey(), val);
			}
		}
		return JsonUtil.toString(paramMap, DateUtil.PATTERN_YEAR2MILLISECOND);
	}

	protected Object unarray(String[] array) {
		if (array != null && array.length == 1) {
			return array[0];
		}
		return array;
	}

	protected void logHeaders(HttpServletRequest request) {
		if (log.isTraceEnabled()) {
			Enumeration<String> headerNames = request.getHeaderNames();
			log.trace("-----------Headers-----------");
			while (headerNames.hasMoreElements()) {
				String headerName = headerNames.nextElement();
				log.trace("{}={}", headerName, request.getHeader(headerName));

			}
		}
	}

	public boolean checkSign(String sign, Map<String, String> params, String secretKey) {
		if (sign == null || sign.length() != 32) {
			return false;
		}

		SortedMap<String, String> sortedParams = null;

		// 排序
		if (params instanceof SortedMap<?, ?>) {
			sortedParams = (SortedMap<String, String>) params;
		} else {
			sortedParams = new TreeMap<String, String>();
			sortedParams.putAll(params);
		}

		// 拼接字符串
		StringBuilder buf = new StringBuilder();
		for (Map.Entry<String, String> entry : sortedParams.entrySet()) {
			buf.append("&" + entry.getKey() + "=" + entry.getValue());
		}
		if (buf.length() > 0) {
			buf.deleteCharAt(0);
		}
		buf.append(secretKey);
		String paramStr = buf.toString();

		// MD5
		String md5 = DigestUtil.md5(paramStr);

		if (!sign.equals(md5)) {
			log.info("签名错误: sign=[{}], md5=[{}], param=[{}]", new Object[] { sign, md5, paramStr });
			return false;
		}
		return true;
	}

	public void parseAppAgent(String appAgent) {
		if (appAgent == null) {
			throw new BusinessException(RespCode.RESP_9970);
		}
		if (StringUtils.indexOfIgnoreCase(appAgent, "IOS") != -1) {
			RequestContext.putAppType(AppTypeEnum.IOS.getCode());
		} else if (StringUtils.indexOfIgnoreCase(appAgent, "Android") != -1) {
			RequestContext.putAppType(AppTypeEnum.ANDROID.getCode());
		} else {
			throw new BusinessException(RespCode.RESP_9970);
		}

		int i;
		if ((i = StringUtils.lastIndexOf(appAgent, '/')) != -1) {
			String ver = appAgent.substring(i + 1);
			try {
				Short verCode = Short.valueOf(ver);
				RequestContext.putAppVersion(verCode);
			} catch (NumberFormatException e) {
				throw new BusinessException(RespCode.RESP_9971);
			}
		}
	}

}
