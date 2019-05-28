package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Person;

public class RequiredAnnoTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Person per=null;
		//create IOC Container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean
		per=ctx.getBean("per",Person.class);
		System.out.println(per);
		
		//close cotainer
		((AbstractApplicationContext) ctx).close();

	}//main
}//class
