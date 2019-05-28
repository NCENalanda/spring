package com.nit.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.config.AppConfig;
import com.nt.service.IntrestAmountCalculator;

@SpringBootApplication
@Import(AppConfig.class)
public class BootApp10AspectjAop21AroundAdivceApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		IntrestAmountCalculator proxy=null;
		ctx=SpringApplication.run(BootApp10AspectjAop21AroundAdivceApplication.class, args);
		//get Proxy object
		proxy=ctx.getBean("iac",IntrestAmountCalculator.class);
		System.out.println("Simple Intrest Amount::"+proxy.calcSimpleIntrAmount(10000, 2, 12));
		System.out.println("____________________");
		System.out.println("Simple Intrest Amount::"+proxy.calcSimpleIntrAmount(10000, 2, 12));
		System.out.println(".........................");
		System.out.println("Compound Intrest Amount::"+proxy.calcCompoundIntrAmount(10000, 2, 12));
		System.out.println("____________________");
		System.out.println("Compound Intrest Amount::"+proxy.calcCompoundIntrAmount(10000, 2, 12));
		//close container
		((ConfigurableApplicationContext) ctx).close();
		
	}
}
