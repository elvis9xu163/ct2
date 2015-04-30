package com.xjd.ct.dal;

import org.fest.assertions.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author elvis.xu
 * @since 2015-02-16 18:09
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:config/spring-*.xml")
public class TestBase {
	public static Logger log = LoggerFactory.getLogger(TestBase.class);
	@Autowired
	ApplicationContext springContext;

	@Test
	public void test() {
		Assertions.assertThat(springContext).isNotNull();
		log.info("TestBase loaded success.");
	}
}
