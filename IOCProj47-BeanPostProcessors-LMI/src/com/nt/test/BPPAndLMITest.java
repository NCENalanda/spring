package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.CollegeService;

public class BPPAndLMITest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		CollegeService service=null;
		 //create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean
		service=ctx.getBean("clgService",CollegeService.class);
		//invoke method
		System.out.println(service.registerEmployee(101,"raja", "programmer"));
		System.out.println(service.registerStudent(102,"rani", "spring"));
		System.out.println("----------------------------------------------------------");
		System.out.println(service.registerEmployee(103,"jani", "Hardaware Engg"));
		System.out.println(service.registerStudent(104,"begum", "coreJava"));
		//close Container
		((AbstractApplicationContext) ctx).close();
	}
}
