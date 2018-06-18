package com.homepage.test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.homepage.config.InfraConfig;
import com.homepage.dao.MusicalDao;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { InfraConfig.class })
public class MybatisTest {

	@Autowired
	DataSource ds;
	@Value("${db.username}")
	String username;
	@Test
	public void test() {
		assertThat(ds, is(notNullValue()));
		assertThat(ds instanceof BasicDataSource, is(true));
		assertThat(username, is("interMission"));
	}
	
	
	
}
