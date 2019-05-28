package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Viechle implements ApplicationContextAware {
	private String beanId;
	ApplicationContext ctx;
	
	static{
		System.out.println("Viechle:static block");
	}
	
	public Viechle() {
		System.out.println("Viechle:0-param constructor");
	}

	public void setBeanId(String beanId) {
		System.out.println("setBeanId(-)");
		this.beanId = beanId;
	}
	
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("setApplicationContext(-)");
		this.ctx=ctx;
	}

	
	public  void entertaiment(){
		System.out.println("Viechle:: Audio Player based Entertainment");
	}
	public void blowHorn(){
		System.out.println("Viechle:: Skoda Horn Sound");
	}
	
	public void move(){
		System.out.println("Viechle:: move()");
		Engine engg=null;
		//get Depedent Bean class object	
		engg=ctx.getBean(beanId,Engine.class);
		//start Engine
		engg.start();
		System.out.println("Viechle Moved...");
	}

	
}
