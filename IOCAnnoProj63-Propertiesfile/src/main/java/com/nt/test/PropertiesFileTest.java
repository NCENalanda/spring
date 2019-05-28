package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.DBOperations;

public class PropertiesFileTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		DBOperations dbo=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean
		dbo=ctx.getBean("dbo",DBOperations.class);
		System.out.println(dbo);
		
		//close container
		((AbstractApplicationContext) ctx).close();
		
		System.out.println(System.getProperties());

	}

}
