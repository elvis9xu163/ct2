package com.xjd.ct.web.util;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.xjd.ct.biz.bo.TokenBo;
import com.xjd.ct.biz.bo.UserBo;

public class SessionContextUtil {

	public static final String TOKEN_KEY = SessionContextUtil.class.getSimpleName() + "token";
	public static final String USER_KEY = SessionContextUtil.class.getSimpleName() + "user";

	public static void pubToken(TokenBo token) {
		((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession().setAttribute(TOKEN_KEY, token);
	}

	public static TokenBo getToken() {
		return (TokenBo) ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession().getAttribute(TOKEN_KEY);
	}
	public static void pubUser(UserBo user) {
		((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession().setAttribute(USER_KEY, user);
	}

	public static UserBo getUser() {
		return (UserBo) ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession().getAttribute(USER_KEY);
	}
}