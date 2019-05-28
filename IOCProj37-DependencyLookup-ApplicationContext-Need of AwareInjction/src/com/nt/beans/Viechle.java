package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Viechle {
	private String beanId;
	
	
	
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
		ApplicationContext ctx=null;
		Engine engg=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml"); 
		//get Depedent class object (Dependency lookup)
		 engg=ctx.getBean(beanId,Engine.class);
		 //start engine
		 engg.start();
		 System.out.println("Viechile is moving...");
	}
}
