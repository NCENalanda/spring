package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.WebContainer;

public class LMISolutionUsingAW_DLTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WebContainer container=null,container1=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Target Bean
        container=ctx.getBean("container",WebContainer.class);
        //invoke method
        container.delegateRequest("Gujarat elections");
        System.out.println("-------------------------------");
        container.delegateRequest("Rohit Sharma Fatest T20 100");
        
        container1=ctx.getBean("container",WebContainer.class);
        //invoke method
        container1.delegateRequest("Gujarat elections11");
        System.out.println("-------------------------------");
        container1.delegateRequest("Rohit Sharma Fatest T20 100 -11");
        
        
        //close Contianer
        ((AbstractApplicationContext) ctx).close();
	}//main
}//class
