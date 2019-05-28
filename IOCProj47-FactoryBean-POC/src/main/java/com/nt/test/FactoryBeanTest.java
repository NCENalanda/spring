package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.ScheduleRemainder;

public class FactoryBeanTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ScheduleRemainder remainder=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean
		remainder=ctx.getBean("remainder",ScheduleRemainder.class);
		System.out.println(remainder.remainder1());
		//close Container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
