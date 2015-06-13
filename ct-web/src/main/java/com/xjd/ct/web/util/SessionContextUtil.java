package com.xjd.ct.web.util;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.xjd.ct.biz.bo.TokenBo;
import com.xjd.ct.biz.bo.UserBo;

public class SessionContextUtil {

    public static final String TOKEN_KEY = SessionContextUtil.class.getSimpleName() + "token";
    public static final String USER_KEY = SessionContextUtil.class.getSimpleName() + "user";

    public static void putToken(TokenBo token) {
        set(TOKEN_KEY, token);
    }

    public static TokenBo getToken() {
        return (TokenBo) get(TOKEN_KEY);
    }

    public static void putUser(UserBo user) {
        set(USER_KEY, user);
    }

    public static UserBo getUser() {
        return (UserBo) get(USER_KEY);
    }

    protected static Object get(String key) {
        ServletRequestAttributes attrs = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes());
        if (attrs != null) {
            return attrs.getRequest().getSession().getAttribute(key);
        }
        return null;
    }

    protected static void set(String key, Object val) {
        ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession().setAttribute(key, val);
    }
}
