package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebContainer implements ApplicationContextAware{
	private String beanId;
	private ApplicationContext ctx;
	
	public WebContainer(String beanId) {
		this.beanId=beanId;
		System.out.println("WebContainer: 1-param constructor");
	}

	
	
	public  void processRequest(String data){
		RequestHandler handler=null;
		System.out.println("webConntainer::Recived request with data -->"+data);
		//Depdendenyc lookup code..
		handler=ctx.getBean(beanId,RequestHandler.class);
		//use handler
		handler.handleRequest(data);
	}//method



	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx=ctx;
		
	}
}//class
