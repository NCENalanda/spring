package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Viechle;

public class DependencyLookupTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Viechle viechle=null;
		//create IOC container
		System.out.println("clientApp: main(-)");
         ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean
		viechle=ctx.getBean("viechle",Viechle.class);
		//invoke methods
		viechle.move();
		viechle.blowHorn();
		viechle.entertainment();
		
		//close container
		((AbstractApplicationContext) ctx).close();
		
	}
}
