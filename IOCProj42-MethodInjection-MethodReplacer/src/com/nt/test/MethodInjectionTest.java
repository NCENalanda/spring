package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.BankService;

public class MethodInjectionTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService service=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean
		service=ctx.getBean("bank",BankService.class);
		System.out.println("class name::"+service.getClass()+" super calss name::"+service.getClass().getSuperclass());
		//invoke method
		System.out.println("Intr Amount::"+service.calcIntrAmt(100000,12));
	  //close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
