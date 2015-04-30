package com.xjd.ct.biz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.fest.assertions.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring-biz.xml"})
public class TestBasePure {

	@Autowired
	ApplicationContext applicationContext;

	@Test
	public void baseTest() {
		assertThat(applicationContext).isNotNull();
	}
}
