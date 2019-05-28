package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebContainer  implements BeanFactoryAware{
	private String beanId;
	//private ApplicationContext ctx;
	private BeanFactory factory;
	
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}
	
	@Override
	public void setBeanFactory(BeanFactory factory) throws BeansException {
		this.factory=factory;
	}


	public WebContainer() {
		System.out.println("WebContainer :: 0-param constructor");
	}
	

/*	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx=ctx;
	}
*/	
	public void  delegateRequest(String data){
		RequestHandler handler=null;
		System.out.println("WebContianer: request recived with "+data+" adn delegating to handler");
		//create IOC container
		//get Depedent Bean obj (Depedencny lookup)
		//handler=ctx.getBean(beanId,RequestHandler.class);
		handler=factory.getBean(beanId,RequestHandler.class);
		handler.proessingRequest(data);
	}
	
}//class
