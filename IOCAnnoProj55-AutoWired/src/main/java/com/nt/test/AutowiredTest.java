package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.WishMessageGenerator;

public class AutowiredTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishMessageGenerator generator=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get bean
		generator=ctx.getBean("wmg",WishMessageGenerator.class);
		//invoke the method
		System.out.println(generator.generateWishMessage("raja"));
		
		//close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
