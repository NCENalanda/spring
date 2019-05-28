package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.ArithmeticOperations;

public class AllAdviceAnnoTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ArithmeticOperations proxy=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean
		proxy=ctx.getBean("arithmetic",ArithmeticOperations.class);
		//invoke the methods
		System.out.println("addition::"+proxy.sum(10,20));
		System.out.println(".....................................");
		System.out.println("subtraction::"+proxy.sub(10,20));
		System.out.println(".....................................");
		System.out.println("Multiplication::"+proxy.mul(10,20));
		System.out.println("..................................");
		System.out.println("Division::"+proxy.div(10, 20));
		System.out.println("..................................");
		System.out.println("Division1::"+proxy.div(10, 0));
		
		//close container
		((AbstractApplicationContext) ctx).close();

	}//main
}//class
