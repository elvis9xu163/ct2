package com.xjd.ct.utl.valid;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class ValidationUtilTest {

	@Test
	public void testCheck() {
//		String check = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
		String check = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
//		String check = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern regex = Pattern.compile(check);
		Matcher matcher = regex.matcher("e@qq.com");
		boolean isMatched = matcher.matches();
		System.out.println(isMatched);
//		ValidationUtil.check(ValidationUtil.EMAIL, "elvis9xu@163.com");
	}
}