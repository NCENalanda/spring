package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.AadharDetails;

public class BuiltInPropertyEditorsTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		AadharDetails ad=null;
		//create  IOC Container 
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean
		ad=ctx.getBean("aadhar",AadharDetails.class);
		System.out.println(ad);
		//close Container
		((AbstractApplicationContext) ctx).close();
	}
}
