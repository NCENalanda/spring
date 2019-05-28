package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Flipkart;

public class AutowiredAnnotationTest {

	public static void main(String[] args) {
		 ApplicationContext ctx=null;
		 Flipkart fpkt=null;
		 //create IOC container
		 ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		 //get Bean
		/* fpkt=ctx.getBean("fpkt",Flipkart.class);
		 System.out.println(fpkt);
		 fpkt.shopping(new String[]{"kite","manza","manzaRoller"});
		 System.out.println("....................................");
		 fpkt=ctx.getBean("fpkt",Flipkart.class);*/
		 //close container
		 ((AbstractApplicationContext) ctx).close();
	}//main
}//class
