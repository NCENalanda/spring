package com.nt.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages={"com.nt.dao","com.nt.service"})
@PropertySource(value = { "classpath:myfile.properties" })
public class AppConfig {
	@Autowired
	private Environment  env;

	@Bean
	 public DataSource createDataSource(){
		 DriverManagerDataSource drds=null;
		 drds=new DriverManagerDataSource();
		 drds.setDriverClassName(env.getRequiredProperty("spring.datasource.driver-class-name"));
		 drds.setUrl(env.getRequiredProperty("spring.datasource.url"));
		 drds.setUsername(env.getRequiredProperty("spring.datasource.username"));
		 drds.setPassword(env.getRequiredProperty("spring.datasource.password"));
		 System.out.println(env.getRequiredProperty("wish.msg"));
		 return drds;
	 }
	
}
