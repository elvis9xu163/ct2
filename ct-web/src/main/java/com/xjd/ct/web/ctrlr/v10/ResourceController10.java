package com.xjd.ct.web.ctrlr.v10;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.xjd.ct.biz.bo.ResourceBo;
import com.xjd.ct.biz.bo.TokenBo;
import com.xjd.ct.biz.service.ResourceService;
import com.xjd.ct.biz.service.UserService;
import com.xjd.ct.utl.DateUtil;
import com.xjd.ct.utl.JsonUtil;
import com.xjd.ct.utl.constant.AppConstant;
import com.xjd.ct.utl.exception.BusinessException;
import com.xjd.ct.utl.respcode.RespCode;
import com.xjd.ct.utl.valid.ValidationUtil;
import com.xjd.ct.web.util.HttpRequestUtil;
import com.xjd.ct.web.view.ResourceBody;
import com.xjd.ct.web.view.View;
import com.xjd.ct.web.view.ViewUtil;

/**
 * @author elvis.xu
 * @since 2015-05-02 22:10
 */
@Controller
@RequestMapping("/10")
public class ResourceController10 {
	public static Logger log = LoggerFactory.getLogger(ResourceController10.class);

	@Autowired
	ResourceService resourceService;
	@Autowired
	UserService userService;

	@RequestMapping("/upload")
	@ResponseBody
	public View upload(@RequestParam(value = "timestamp", required = false) String timestamp,
			@RequestParam(value = "token", required = false) String token,
			@RequestParam(value = "sign", required = false) String sign,
			@RequestParam(value = "file", required = false) MultipartFile multipartFile, HttpServletRequest request) {
		String userIp = HttpRequestUtil.getRealRemoteAddr(request);
		String fixLogString = "version=10, service=upload, userIp=" + userIp + ", timestamp=" + timestamp + ", token="
				+ token + ", sign=" + sign;
		View view = null;
		log.info("上传资源开始: {}", fixLogString);
		try {
			// 参数校验
			ValidationUtil.check(ValidationUtil.TIMESTAMP, timestamp);
			if (StringUtils.isEmpty(token)) {
				throw new BusinessException(RespCode.RESP_0001, new Object[] { "token" });
			}
			// TODO sign校验
			if (multipartFile == null || multipartFile.isEmpty()) {
				throw new BusinessException(RespCode.RESP_0220);
			}

			// 用户判断
			TokenBo tokenBo = userService.queryTokenByToken(token);
			if (tokenBo == null || AppConstant.ANONYMOUS_USERID.equals(tokenBo.getUserId())) {
				throw new BusinessException(RespCode.RESP_0101);
			}

			// 获取文件信息
			String suffix = "";
			String orgName = multipartFile.getOriginalFilename();
			int i = 0;
			if (orgName != null && (i = orgName.lastIndexOf('.')) != -1) {
				suffix = orgName.substring(i + 1);
			}
			File tmpFile = File.createTempFile(tokenBo.getUserId().toString(), suffix);
			multipartFile.transferTo(tmpFile);

			// 业务调用
			ResourceBo resourceBo = resourceService.upload(tokenBo.getUserId(), tmpFile, suffix,
					multipartFile.getContentType());

			// 返回结果
			ResourceBody body = new ResourceBody();
			body.setResource(resourceBo);
			view = ViewUtil.defaultView();
			view.setBody(body);

		} catch (BusinessException e) {
			view = ViewUtil.defaultView(e.getCode(), e.getArgs(), e.getMsg(), e.getOriginalCode(), e.getOrginalMsg());
			if (e.getCause() != null) {
				log.error("上传资源异常: " + fixLogString, e);
			} else {
				log.warn("上传资源异常: {}, businessException={}", fixLogString, e);
			}

		} catch (Throwable t) {
			view = ViewUtil.defaultView(RespCode.RESP_9999);
			log.error("上传资源异常: " + fixLogString, t);
		}
		log.info("上传资源结束: {}, result={}", fixLogString,
				JsonUtil.toStringIncludeIgnoredProperties(view, DateUtil.PATTERN_YEAR2MILLISECOND));
		return view;
	}

	@RequestMapping("/download")
	public void download(@RequestParam(value = "resId", required = false) String resId, HttpServletResponse resp)
			throws IOException {
		log.info("下载资源开始: resId={}", resId);
		ResourceBo resourceBo = resourceService.queryResource(resId);
		if (resourceBo == null) {
			resp.setStatus(404);
			log.warn("下载资源异常: 资源不存在 resId={}", resId);
			return;
		}

		resp.reset();
		if (StringUtils.isNotBlank(resourceBo.getContentType())) {
			resp.setContentType(resourceBo.getContentType());
		} else {
			resp.setHeader(
					"Content-Disposition",
					"attachment; filename=file"
							+ (StringUtils.isNotBlank(resourceBo.getResFormat()) ? "." + resourceBo.getResFormat() : ""));
			resp.setContentType("application/octet-stream; charset=utf-8");
		}
		if (resourceBo.getResLength() != null) {
			resp.setContentLength(resourceBo.getResLength().intValue());
		}
		OutputStream out = resp.getOutputStream();
		resourceService.download(resId, out);
		out.flush();
		log.info("下载资源结束: resId={}", resId);
	}
}
