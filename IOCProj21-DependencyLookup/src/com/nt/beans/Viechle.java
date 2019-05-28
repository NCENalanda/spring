package com.nt.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Viechle {
	private String beanId;
	
	
	public Viechle(String beanId) {
		this.beanId = beanId;
	}

	public Viechle() {
		System.out.println("Viechle:0-param constructor");
	}
	
	public  void blowHorn(){
		 System.out.println("Viechle:blowing Horn--->Skoda Horn");
	}
	public  void  entertainment(){
		 System.out.println("Viechle:entertainment--->Audio/Video DVD player");
	}
	
	public void move(){
		System.out.println("Viechle: move()");		
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Engine engg=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Depedent class object (Dependency lookup)
		 engg=factory.getBean(beanId,Engine.class);
		 //start engine
		 engg.start();
		 System.out.println("Viechile is moving...");
	}
}
