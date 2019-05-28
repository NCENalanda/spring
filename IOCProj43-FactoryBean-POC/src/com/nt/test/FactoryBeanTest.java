package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.ScheduleRemainder;

public class FactoryBeanTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ScheduleRemainder rem=null;
		//create IOc container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get bean
		rem=ctx.getBean("remainder",ScheduleRemainder.class);
		//invoke method
		System.out.println(rem.remainder());
		//close Container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
