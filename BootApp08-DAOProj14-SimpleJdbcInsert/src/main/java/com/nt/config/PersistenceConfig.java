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
public class PersistenceConfig {
	@Autowired
	  private DataSource ds;
	
	
	@Bean
	public  SimpleJdbcInsert  createSJInsert(){
		System.out.println(ds.getClass());
		return new SimpleJdbcInsert(ds);
	}

}
