package com.xjd.ct.web.util;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.xjd.ct.biz.bo.TokenBo;

public class SessionContextUtil {

	public static final String TOKEN_KEY = SessionContextUtil.class.getSimpleName() + "token";

	public static void pubToken(TokenBo token) {
		((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession().setAttribute(TOKEN_KEY, token);
	}

	public static TokenBo getToken() {
		return (TokenBo) ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession().getAttribute(TOKEN_KEY);
	}
}
