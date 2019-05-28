package com.nt.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class RootAppConfig {
	static{
		System.out.println("RootAppConfig:static block");
	}
	
	public RootAppConfig() {
		System.out.println("RootAppConfig:0-param consturctor");
	}
	
	

}
