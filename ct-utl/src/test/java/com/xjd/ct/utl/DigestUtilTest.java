package com.xjd.ct.utl;

import org.junit.Test;

public class DigestUtilTest {

	@Test
	public void testMd5() throws Exception {
		System.out.println(DigestUtil.md5("HELLOWORLD!"));
	}

	@Test
	public void testSha() throws Exception {
		System.out.println(DigestUtil.sha("HELLOWORLD!"));
	}
}