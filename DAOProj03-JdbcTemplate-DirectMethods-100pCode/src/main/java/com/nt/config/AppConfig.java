package com.nt.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages={"com.nt.dao","com.nt.service"})
@PropertySource(value = { "classpath:com/nt/commons/jdbc.properties" })
public class AppConfig {
	@Autowired
	private Environment env;

	@Bean(name="dbcpDs")
	public  DataSource createDataSource(){
		BasicDataSource bds=null;
		bds=new BasicDataSource();
		bds.setDriverClassName(env.getRequiredProperty("jdbc.driver"));
		bds.setUrl(env.getRequiredProperty("jdbc.url"));
		bds.setUsername(env.getRequiredProperty("jdbc.username"));
		bds.setPassword(env.getRequiredProperty("jdbc.password"));
		return bds;
	}//method
	
	@Bean(name="template")
	public JdbcTemplate  createJdbcTemplate(){
		JdbcTemplate template=null;
		template=new JdbcTemplate(createDataSource());
		return template;
	}
	
	/*@Bean(name="template")
	@Autowired
	public JdbcTemplate  createJdbcTemplate(){
		JdbcTemplate template=null;
		template=new JdbcTemplate();
		return template;
		
	}*/
	
}//class
