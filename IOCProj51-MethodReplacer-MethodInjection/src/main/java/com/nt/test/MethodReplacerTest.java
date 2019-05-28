package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.IntrAmountCalculator;

public class MethodReplacerTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		IntrAmountCalculator iac=null;
		//create IOC container
		 ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean
		 iac=ctx.getBean("iac",IntrAmountCalculator.class);
		 //invoke the method
		 System.out.println("Intr Amount:::"+iac.calcSimpleIntrAmount(100000, 12));
		 System.out.println("Bean obj class name::"+iac.getClass()+"==> "+iac.getClass().getSuperclass());
		 //close container
		 ((AbstractApplicationContext) ctx).close();
	}//main
}//class
