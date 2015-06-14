package com.xjd.ct.web.ctrlr;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.xjd.ct.biz.service.ObjectUpdateService;
import com.xjd.ct.utl.exception.BusinessException;
import com.xjd.ct.utl.respcode.RespCode;
import com.xjd.ct.web.util.I18NUtil;
import com.xjd.ct.web.util.SessionContextUtil;

/**
 * @author elvis.xu
 * @since 2015-05-26 22:02
 */
@Controller
@RequestMapping("/admin/launchpic")
public class LaunchPicController {
	private static Logger log = LoggerFactory.getLogger(LaunchPicController.class);

	@Autowired
	ObjectUpdateService objectUpdateService;

	@RequestMapping("/edit/input")
	public String input() {
		return "admin/launch_edit";
	}

	@RequestMapping("/edit")
	public String edit(@RequestParam(value = "img", required = false) String img, RedirectAttributes redirectAttributes) {

		String errCode, errMsg;
		try {
			objectUpdateService.setLaunchPic(SessionContextUtil.getUser().getUserId(), img);
			errCode = RespCode.RESP_0000;
			errMsg = I18NUtil.getMsg(errCode);
		} catch (Exception e) {

			if (e instanceof BusinessException) {
				errCode = ((BusinessException) e).getCode();
				errMsg = ((BusinessException) e).getMsg();
			} else {
				log.error("", e);
				errCode = RespCode.RESP_9999;
				errMsg = I18NUtil.getMsg(errCode);
			}
		}

		redirectAttributes.addAttribute("errCode", errCode);
		try {
			redirectAttributes.addAttribute("errMsg", URLEncoder.encode(errMsg, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			throw new BusinessException(RespCode.RESP_9999, e);
		}
		return "redirect:/admin/launchpic/edit/input";
	}
}
