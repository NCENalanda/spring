package com.nt.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nt.external.ICCScoreComp;
import com.nt.locator.ICCScoreCompServiceLocator;

@Configuration
@ComponentScan(basePackages="com.nt.service")
public class AppConfig {
	/*@Value("icc")
	private String jndiName;
	
	@Bean
	public  ICCScoreComp createExtServiceComp(){
		return ICCScoreCompServiceLocator.getService(jndiName);
	}*/

}
