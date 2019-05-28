package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.PassportInfo;

public class BuiltinPropertyEditorsTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		PassportInfo info=null;
		//Create IOC Container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean
		info=ctx.getBean("pspt",PassportInfo.class);
		System.out.println(info);
		//close container
		((AbstractApplicationContext) ctx).close();
	}
}
