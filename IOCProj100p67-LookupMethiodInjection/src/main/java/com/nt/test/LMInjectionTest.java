package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.MyServletContainer;
import com.nt.config.AppConfig;

public class LMInjectionTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		MyServletContainer container=null,container1=null;
		//create IOC container
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get Taget Bean
		container=ctx.getBean("container",MyServletContainer.class);
		System.out.println(container.getClass());
		container.processRequest("hello");
		System.out.println("---------------------");
		container.processRequest("hai");
		System.out.println("=====================");
		
		//close container
		((AbstractApplicationContext) ctx).close();

	}//main
}//class
