package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.nt.controller")
public class WebMVCAppConfig {
	static{
		System.out.println("WebMVCAppConfig:static block");
	}
	
	public WebMVCAppConfig() {
		System.out.println("WebMVCAppConfig:0-param constructor");
	}

	@Bean
	public  ViewResolver createIVResolver(){
		System.out.println("createIVResolver()");
		InternalResourceViewResolver ivr=null;
		ivr=new InternalResourceViewResolver();
		ivr.setPrefix("/WEB-INF/pages/");
		ivr.setSuffix(".jsp");
		return ivr;
	}
}
