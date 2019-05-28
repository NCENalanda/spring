package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@Configuration
@ComponentScan(basePackages="com.nt.dao")
public class PersistenceConfig {
	
	@Bean
	public javax.sql.DataSource createDataSource(){
		org.apache.tomcat.jdbc.pool.DataSource ds=null;
		ds=new org.apache.tomcat.jdbc.pool.DataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUsername("system");
		ds.setPassword("manager");
		return ds;
	}
	
	@Bean
	public NamedParameterJdbcTemplate  createNPJT(){
	  return new NamedParameterJdbcTemplate(createDataSource());
	}

}
