package com.nt.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebContainer {
	private String beanId;
	
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}


	public WebContainer() {
		System.out.println("WebContainer :: 0-param constructor");
	}

	
/*	public void  delegateRequest(String data){
		ApplicationContext ctx=null;
		RequestHandler handler=null;
		System.out.println("WebContianer: request recived with "+data+" adn delegating to handler");
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Depedent Bean obj (Depedencny lookup)
		handler=ctx.getBean(beanId,RequestHandler.class);
		handler.proessingRequest(data);
	}*/
	
	public void  delegateRequest(String data){
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		RequestHandler handler=null;
		System.out.println("WebContianer: request recived with "+data+" adn delegating to handler");
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Depedent Bean obj (Depedencny lookup)
		handler=factory.getBean(beanId,RequestHandler.class);
		handler.proessingRequest(data);
	}
	
}//class
