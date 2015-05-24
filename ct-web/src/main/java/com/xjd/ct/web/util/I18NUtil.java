package com.xjd.ct.web.util;

public class I18NUtil {

	public static String getMsg(String code) {
		return getMsg(code, null, null);
	}
	
	public static String getMsg(String code, Object[] args) {
		return getMsg(code, args, null);
	}
	
	public static String getMsg(String code, String defaultMsg) {
		return getMsg(code, null, defaultMsg);
	}
	
	public static String getMsg(String code, Object[] args, String defaultMsg) {
		// FIXME
		return "请实现我！";
	}
}
