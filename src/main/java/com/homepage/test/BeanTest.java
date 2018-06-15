package com.homepage.test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.homepage.config.BusinessLogicConfig;
import com.homepage.config.MVCConfig;
import com.homepage.service.CommentService;
@RunWith(SpringRunner.class)
@ContextConfiguration(classes= {BusinessLogicConfig.class})
public class BeanTest {
	
	@Autowired
	SqlSessionTemplate session;
	
	@Autowired
	CommentService service;
	
	@Test
	public void test() {
		assertThat(service, is(notNullValue()));
	}

}
