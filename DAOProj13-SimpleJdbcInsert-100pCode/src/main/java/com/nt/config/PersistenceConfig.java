package com.nt.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

@Configuration
@ComponentScan(basePackages="com.nt.dao")
@PropertySource(value="classpath:com/nt/commons/jdbc.properties")
public class PersistenceConfig {
	@Autowired
	private Environment env;
	
	@Bean
	public DataSource createDataSource(){
		org.apache.tomcat.jdbc.pool.DataSource ds=null;
		ds=new org.apache.tomcat.jdbc.pool.DataSource();
		ds.setDriverClassName(env.getRequiredProperty("jdbc.driver"));
		ds.setUrl(env.getRequiredProperty("jdbc.url"));
		ds.setUsername(env.getRequiredProperty("jdbc.user"));
		ds.setPassword(env.getRequiredProperty("jdbc.pwd"));
		return ds;
	}
	
	@Bean
	public  SimpleJdbcInsert  createSJInsert(){
		return new SimpleJdbcInsert(createDataSource());
	}

}
