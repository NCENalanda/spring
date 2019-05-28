package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.ShoppingStore;

public class SPELTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ShoppingStore store=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean
		store=ctx.getBean("store",ShoppingStore.class);
		System.out.println(store);
		//close container
		((AbstractApplicationContext) ctx).close();
		
		System.out.println(System.getProperties());
		System.out.println("region::"+System.getProperty("java.vm.specification.vendor"));
		
	}//main
}//class
