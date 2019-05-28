package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.target.IntrestAmountCalculator;

public class AroundAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		IntrestAmountCalculator proxy=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Proxy object
		proxy=ctx.getBean("pfb",IntrestAmountCalculator.class);
		System.out.println("Proxy obj class name::"+proxy.getClass()+"  --->super class"+proxy.getClass().getSuperclass());
		//invoke taget/b.method
		try{
		System.out.println("Simple Intr Amount::"+proxy.calcSimpleIntrAmount(1000001,2,12));
		System.out.println(".....................................");
		System.out.println("Simple Intr Amount::"+proxy.calcSimpleIntrAmount(1000001,2,12));
          }
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println("-------------------------------------------");
		System.out.println("Compound Intr Amount::"+proxy.calcCompoundIntrAmount(1000001,2,12));
		//close container
		((AbstractApplicationContext) ctx).close();

	}//main
}//class
