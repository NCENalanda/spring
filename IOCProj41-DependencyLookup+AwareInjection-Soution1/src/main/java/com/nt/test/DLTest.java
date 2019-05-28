package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Viechle;

public class DLTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Viechle viechle=null;
		 //create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean
	/*	viechle=ctx.getBean("viechle",Viechle.class);
		//invoke methods
		viechle.move();
		viechle.entertaiment();
		viechle.blowHorn();
		*/
		
		//close IOC container
		((AbstractApplicationContext) ctx).close();

	}//main
}//class
