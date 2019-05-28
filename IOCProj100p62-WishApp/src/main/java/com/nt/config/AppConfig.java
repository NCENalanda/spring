package com.nt.config;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages="com.nt.beans")
public class AppConfig {
	
	static{
		System.out.println("AppConfig:static block");
	}
	
	public AppConfig() {
		System.out.println("AppConfig:0-param constructor");
	}
	

	@Bean(name="cal")
	@Scope("singleton")
	//@Lazy(value=true)
	public Calendar  createCalendar(){
		System.out.println("AppConfig:createCalendar()");
		Calendar calendar=null;
		calendar=Calendar.getInstance();
		return calendar;
	}
	
	

}
