package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class TestBean implements  BeanFactoryAware, ApplicationContextAware,InitializingBean,DisposableBean,BeanNameAware {
	private String name;

	
	public void setName(String name) {
		System.out.println("TestBean::setName(-)");
		this.name = name;
	}

	public TestBean() {
		System.out.println("TestBean:0-param constructor");
	}
	
		@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("setApplicationContext(-)");

	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
	System.out.println("setBeanFactory(-)");

	}

	@Override
	public void setBeanName(String arg0) {
		System.out.println("setBeanName(-)");

	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy() method");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
		
	}
	public void myInit(){
		System.out.println("custom Init()");
	}
	
	public void myDestroy(){
		System.out.println("custom Destroy()");
	  }
}//class
