package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.IntrestAmountCalculator;

public class AspectJAOPAroundTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		IntrestAmountCalculator proxy=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean
		proxy=ctx.getBean("iac",IntrestAmountCalculator.class);
		System.out.println("proxy obj class name::"+proxy.getClass());
		//invoke method
		System.out.println("Simple Intr Amount::"+proxy.calcSimpleIntrAmount(50000, 2, 12));
		System.out.println(".....");
		System.out.println("Simple Intr Amount::"+proxy.calcSimpleIntrAmount(100000, 2, 12));
		System.out.println("------------------------------------------------");
		System.out.println("Compound Intr Amount::"+proxy.calcCompoundIntrAmount(100000, 2, 12));
		System.out.println(".....");
		System.out.println("Compound Intr Amount::"+proxy.calcCompoundIntrAmount(100000, 2, 12));
		//close container
		((AbstractApplicationContext) ctx).close();
	}

}
