package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.EmployeeController;

public class RealtimeDITest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeController controller=null;
		 //create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get EmployeeController class object
		controller=ctx.getBean("empController",EmployeeController.class);
		try{
		//invoke B.method
		System.out.println("result:::"+controller.process("raja","9000"));
		}
		catch(Exception e){
			System.out.println("Internal Problem Try Again-->"+e.getMessage());
		}
		
		((AbstractApplicationContext) ctx).close();

	}//main
}//class
