package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Viechle implements ApplicationContextAware{
	ApplicationContext ctx;
	private String beanId;
	
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("setApplicaitonContext(-)");
	this.ctx=ctx;
		
	}
	
	
	public Viechle(String beanId) {
		System.out.println("Viechle:: 1-param constructor");
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
		Engine engg=null;
		//get Depedent class object (Dependency lookup)
		 engg=ctx.getBean(beanId,Engine.class);
		 //start engine
		 engg.start();
		 System.out.println("Viechile is moving...");
	}

	
}
