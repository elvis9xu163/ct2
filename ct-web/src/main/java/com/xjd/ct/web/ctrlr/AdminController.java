package com.xjd.ct.web.ctrlr;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xjd.ct.biz.bo.TokenBo;
import com.xjd.ct.biz.bo.UserBo;
import com.xjd.ct.biz.service.UserService;
import com.xjd.ct.utl.exception.BusinessException;
import com.xjd.ct.utl.respcode.RespCode;
import com.xjd.ct.web.util.HttpRequestUtil;
import com.xjd.ct.web.util.I18NUtil;
import com.xjd.ct.web.util.SessionContextUtil;

@Controller
@RequestMapping("/admin")
public class AdminController {
	private static Logger log = LoggerFactory.getLogger(AdminController.class);

	public static final String PAGE_LOGIN = "admin/login";

	@Autowired
	UserService userService;

	@RequestMapping("/login/input")
	public String loginInput() {
		return PAGE_LOGIN;
	}

	@RequestMapping("/login")
	public String loginInput(@RequestParam("username") String username
			, @RequestParam("password") String password
			, @RequestParam(value = "rememberme", required = false) String rememberme
			, HttpServletRequest request, Map model) {

		String ip = HttpRequestUtil.getRealRemoteAddr(request);

		try {
			TokenBo token = userService.signin(username, password, ip, null);
			SessionContextUtil.putToken(token);
			UserBo userBo = userService.getUserInfoSimple(token.getUserId());
			SessionContextUtil.putUser(userBo);
		} catch (BusinessException e) {
			model.put("errorCode", e.getCode());
			model.put("errorMsg", I18NUtil.getMsg(e.getCode(), e.getArgs(), e.getMsg()));

			if (e.getCause() != null) {
				log.error("", e);
			} else {
				log.warn("", e);
			}
			return PAGE_LOGIN;
		} catch (Exception e) {
			model.put("errorCode", RespCode.RESP_9999);
			model.put("errorMsg", I18NUtil.getMsg(RespCode.RESP_9999));
			log.error("", e);
			return PAGE_LOGIN;
		}

		return "redirect:/admin";
	}

	@RequestMapping("/logout")
	public String logout() {
		SessionContextUtil.putToken(null);
		return "redirect:/login";
	}

	@RequestMapping({"/",""})
	public String admin() {
		return "admin/index";
	}

}
