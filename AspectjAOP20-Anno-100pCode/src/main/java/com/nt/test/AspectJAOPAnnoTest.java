package com.nt.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.config.AppConfig;
import com.nt.service.IntrestAmountCalculator;

public class AspectJAOPAnnoTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		IntrestAmountCalculator proxy=null;
		//create IOC container
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get Proxy object
		proxy=ctx.getBean("iac",IntrestAmountCalculator.class);
		//invoke methods
		System.out.println("Simple Intrest Amount::"+proxy.calcSimpleIntrAmount(100000,2,10));
		System.out.println("__________");
		System.out.println("Simple Intrest Amount::"+proxy.calcSimpleIntrAmount(100000,2,10));
		System.out.println(".............................");
		System.out.println("Compound Intrest Amount::"+proxy.calcCompoundIntrAmount(100000, 2,10));
		System.out.println("__________");
		System.out.println("Compound Intrest Amount::"+proxy.calcCompoundIntrAmount(100000, 2,10));
		
		//close container
		((AbstractApplicationContext) ctx).close();

	}

}
