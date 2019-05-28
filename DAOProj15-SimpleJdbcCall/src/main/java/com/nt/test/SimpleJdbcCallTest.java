package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.LoginService;

public class SimpleJdbcCallTest {

	public static void main(String[] args) {
		LoginService service=null;
		ApplicationContext ctx=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Service class object
		service=ctx.getBean("loginService",LoginService.class);
		//invoke method
		System.out.println("Resutl:::"+service.validate("raja","rani"));
		
		//close Contianer
		((AbstractApplicationContext) ctx).close();

	}//main
}//class
