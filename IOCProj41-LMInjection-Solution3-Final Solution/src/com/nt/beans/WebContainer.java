package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class WebContainer {
	
	public WebContainer() {
		System.out.println("WebContainer:0-param constructor");
	}
	
	public abstract RequestHandler getRequestHandler();
	
	public  void processRequest(String data){
		RequestHandler handler=null;
		System.out.println("webConntainer::Recived request with data -->"+data);
		//get Depedent class obj
		handler=getRequestHandler();
		//use handler
		handler.handleRequest(data);
	}//method



	
}//class
