package com.nt.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Bank;
import com.nt.config.AppConfig;

public class MethodReplacerTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Bank bank=null;
		float intrAmt=0.0f;
		//create IOC container
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get Bean
		bank=ctx.getBean("bank",Bank.class);
		// invoke the mthod
		intrAmt=bank.calcIntrAmt(10000, 20);
		System.out.println("Intrest Amount::"+intrAmt);
		//close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
