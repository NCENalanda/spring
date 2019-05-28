package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebContainer {
	private String beanId;
	
	public WebContainer(String beanId) {
		this.beanId=beanId;
		System.out.println("WebContainer: 1-param constructor");
	}

	
	
	public  void processRequest(String data){
		ApplicationContext ctx=null;
		RequestHandler handler=null;
		System.out.println("webConntainer::Recived request with data -->"+data);
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//Depdendenyc lookup code..
		handler=ctx.getBean(beanId,RequestHandler.class);
		//use handler
		handler.handleRequest(data);
	}//method
}//class
