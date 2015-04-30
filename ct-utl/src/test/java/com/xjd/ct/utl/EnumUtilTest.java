package com.xjd.ct.utl;

import static org.fest.assertions.api.Assertions.assertThat;

import org.junit.Test;

import com.xjd.ct.utl.enums.BoolEnum;

public class EnumUtilTest {

	@Test
	public void testValid() {
		assertThat(EnumUtil.valid(BoolEnum.class, "1")).isTrue();
		Throwable t = null;
		try {
			EnumUtil.valid(BoolEnum.class, 1);
		} catch (Exception e) {
			t = e;
		}
		assertThat(t).hasMessageStartingWith("No valid method");
	}

}
