package com.xjd.ct.utl;

import com.xjd.ct.utl.valid.ValidationUtil;

/**
 * 应用的常用工具方法
 * 
 * @author elvis.xu
 * @since 2015-03-23 13:37
 */
public abstract class AppUtil {
	/**
	 * 判断给定的字符串是手机号还是邮箱
	 * 
	 * @param text
	 * @return 0-既不是手机也不是邮箱, 1-手机, 2-邮箱
	 */
	public static int mobileOrEmail(String text) {
		if (ValidationUtil.valid(ValidationUtil.MOBILE, text)) {
			return 1;
		}
		if (ValidationUtil.valid(ValidationUtil.EMAIL, text)) {
			return 2;
		}
		return 0;
	}
}
