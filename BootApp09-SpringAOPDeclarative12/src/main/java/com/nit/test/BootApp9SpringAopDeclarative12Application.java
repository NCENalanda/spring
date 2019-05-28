package com.nit.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.config.AppConfig;
import com.nt.service.IntrestAmountCalculator;

@SpringBootApplication
@Import(value=AppConfig.class)
public class BootApp9SpringAopDeclarative12Application {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		IntrestAmountCalculator proxy;
		//get Container
		ctx=SpringApplication.run(BootApp9SpringAopDeclarative12Application.class, args);
		//get Proxy object
		proxy=ctx.getBean("getProxy",IntrestAmountCalculator.class);
		System.out.println("Simple Intr Amount::"+proxy.calcSimpleIntrAmount(100000,2, 12));
		System.out.println("--------------------------------------");
		System.out.println("Compound Intr Amount::"+proxy.calcCompoundIntrAmount(100000,2, 12));
		
		//close container
		((ConfigurableApplicationContext) ctx).close();
	}
}
