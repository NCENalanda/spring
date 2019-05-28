package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.TestBean;

public class BeanLifeCycleTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		TestBean tb=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean
		tb=ctx.getBean("tb",TestBean.class);
		//invoke B.method
		System.out.println(tb.sayHello());
		
		//cose container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
