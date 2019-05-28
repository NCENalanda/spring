package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Flipkart;

public class BeanCollabarationLCTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Flipkart fpkt=null;
		//create IOCContainer
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean
		fpkt=ctx.getBean("fpkt",Flipkart.class);
		fpkt.shooping(new String[]{"P-K","colors","color pump","sweets"});
		//close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
