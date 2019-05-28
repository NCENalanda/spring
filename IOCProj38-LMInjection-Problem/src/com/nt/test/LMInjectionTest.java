package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.WebContainer;

public class LMInjectionTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WebContainer container1=null,container2;
		//create IOC contianer
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean
		container1=ctx.getBean("container",WebContainer.class);
		container1.processRequest("hello");
		System.out.println("...................................................");
		container2=ctx.getBean("container",WebContainer.class);
		container2.processRequest("hai");
		//close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
