package com.xjd.ct.biz;

import java.util.UUID;

/**
 * @author elvis.xu
 * @since 2015-02-27 11:46
 */
public class AnyTest {

	public static void main(String[] args) {
		System.out.println(UUID.randomUUID().toString().replaceAll("-", "").toUpperCase());
	}
}
