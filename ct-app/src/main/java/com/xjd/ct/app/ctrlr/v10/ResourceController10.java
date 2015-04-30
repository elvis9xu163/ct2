package com.xjd.ct.app.ctrlr.v10;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.xjd.ct.app.util.RequestContext;
import com.xjd.ct.app.view.View;
import com.xjd.ct.app.view.ViewUtil;
import com.xjd.ct.app.view.body.ResourceBody;
import com.xjd.ct.app.view.vo.ResourceVo;
import com.xjd.ct.biz.bo.ResourceBo;
import com.xjd.ct.biz.bo.TokenBo;
import com.xjd.ct.biz.bo.UserBo;
import com.xjd.ct.biz.service.ResourceService;
import com.xjd.ct.biz.service.UserService;
import com.xjd.ct.utl.constant.AppConstant;
import com.xjd.ct.utl.exception.BusinessException;
import com.xjd.ct.utl.respcode.RespCode;

/**
 * <pre>
 * 资源控制器
 * 1. 资源的上传
 * 2. 资源的下载
 * </pre>
 * 
 * @author elvis.xu
 * @since 2015-3-26 上午10:06:03
 */
@Controller
@RequestMapping("/10")
public class ResourceController10 {
	@Autowired
	ResourceService resourceService;
	@Autowired
	UserService userService;

	@RequestMapping("/upload")
	@ResponseBody
	public View upload(@RequestParam(value = "token", required = false) String token,
			@RequestParam(value = "file", required = false) MultipartFile mutipartFile) throws IOException {
		if (token == null) {
			throw new BusinessException(RespCode.RESP_0001, new Object[] { "token" });
		}
		TokenBo tokenBo = userService.queryTokenByToken(token);
		if (tokenBo != null && !AppConstant.ANONYMOUS_USERID.equals(tokenBo.getUserId())) {
			UserBo userBo = userService.queryUserByUserId(tokenBo.getUserId());
			if (userBo == null) {
				throw new BusinessException(RespCode.RESP_0110);
			}
			RequestContext.putUserId(userBo.getUserId());
		}

		if (mutipartFile == null || mutipartFile.isEmpty()) {
			throw new RuntimeException(RespCode.RESP_0220);
		}
		String suffix = "";
		String orgName = mutipartFile.getOriginalFilename();
		int i = 0;
		if (orgName != null && (i = orgName.lastIndexOf('.')) != -1) {
			suffix = orgName.substring(i + 1);
		}
		File tmpFile = File.createTempFile(RequestContext.checkAndGetUserId().toString(), suffix);
		mutipartFile.transferTo(tmpFile);

		// 业务调用
		ResourceBo resourceBo = resourceService.upload(RequestContext.checkAndGetUserId(), tmpFile, suffix,
				mutipartFile.getContentType());

		// 返回结果
		ResourceBody body = new ResourceBody();
		if (resourceBo != null) {
			ResourceVo vo = new ResourceVo();
			BeanUtils.copyProperties(resourceBo, vo);
			body.setResource(vo);
		}

		View view = ViewUtil.defaultView();
		view.setBody(body);
		return view;
	}

	@RequestMapping("/download")
	public void download(@RequestParam(value = "resId", required = false) String resId, HttpServletResponse resp)
			throws IOException {
		ResourceBo resourceBo = resourceService.queryResource(resId);
		if (resourceBo == null) {
			resp.setStatus(404);
			return;
		}

		resp.reset();
		resp.setHeader(
				"Content-Disposition",
				"attachment; filename=file"
						+ (StringUtils.isNotBlank(resourceBo.getResFormat()) ? "." + resourceBo.getResFormat() : ""));
		if (StringUtils.isNotBlank(resourceBo.getResContentType())) {
			resp.setContentType(resourceBo.getResContentType());
		} else {
			resp.setContentType("application/octet-stream; charset=utf-8");
		}
		OutputStream out = resp.getOutputStream();
		resourceService.download(resId, out);
		out.flush();
	}
}
