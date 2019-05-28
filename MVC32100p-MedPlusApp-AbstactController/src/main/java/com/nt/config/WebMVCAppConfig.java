package com.nt.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.ParameterizableViewController;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.nt.controller")
public class WebMVCAppConfig {
	
	@Bean
	public  SimpleUrlHandlerMapping  createSUHMapping(){
		SimpleUrlHandlerMapping suhm=null;
		Properties props=null;
		suhm=new SimpleUrlHandlerMapping();
		props=new Properties();
		props.put("/home.htm","pvc");
		suhm.setMappings(props);
		return suhm;
	}
	
	@Bean(name="pvc")
	public  ParameterizableViewController  createPVController(){
		ParameterizableViewController pvc=null;
		pvc=new ParameterizableViewController();
		pvc.setViewName("welcome");
		return pvc;
	}
	
	@Bean
	public  InternalResourceViewResolver createIVResolver(){
		InternalResourceViewResolver ivr=null;
		ivr=new InternalResourceViewResolver();
		ivr.setPrefix("/WEB-INF/pages/");
		ivr.setSuffix(".jsp");
		return ivr;
	}
	

}
