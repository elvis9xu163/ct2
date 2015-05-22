package com.xjd.ct.utl;

import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

public class DateUtilTest {

	@Test
	public void test() {
		Date d = new Date();
		d = DateUtils.addHours(d, -2);
		System.out.println(DateUtil.parseToMilliseconds(d));
	}
}