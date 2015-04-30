package com.xjd.ct.utl.context;

import org.fest.assertions.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/spring-utl.xml")
public class AppContextTest {
	public static Logger log = LoggerFactory.getLogger(AppContextTest.class);

	@Test
	public void test() {
		Assertions.assertThat(AppContext.isEnvProduct()).isFalse();
	}
}