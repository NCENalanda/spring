package com.nt.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jndi.JndiObjectFactoryBean;

@Configuration
@ComponentScan(basePackages="com.nt.dao")
public class PersistenceAppConfig {

	@Bean
	public  JndiObjectFactoryBean  createJofb(){
		JndiObjectFactoryBean jofb=null;
		jofb=new JndiObjectFactoryBean();
		jofb.setJndiName("java:/comp/env/DsJndi");
		return jofb;
	}
	@Bean
	@Primary
	public  DataSource  createDataSource(){
		return (DataSource)createJofb().getObject();
	}
	
	@Bean
	public JdbcTemplate createJdbcTemplate(){
		return  new JdbcTemplate(createDataSource());
	}
	
}
