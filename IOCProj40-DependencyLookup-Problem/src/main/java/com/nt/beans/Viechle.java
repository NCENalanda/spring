package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Viechle {
	private String beanId;

	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}
	
	public  void entertaiment(){
		System.out.println("Viechle:: Audio Player based Entertainment");
	}
	public void blowHorn(){
		System.out.println("Viechle:: Skoda Horn Sound");
	}
	/*public void move(){
		System.out.println("Viechle:: move()");
		ApplicationContext ctx=null;
		Engine engg=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Depedent Bean class object	
		engg=ctx.getBean(beanId,Engine.class);
		//start Engine
		engg.start();
		System.out.println("Viechle Moved...");
	}*/
	
	public void move(ApplicationContext ctx){
		System.out.println("Viechle:: move()");
		Engine engg=null;
		//get Depedent Bean class object	
		engg=ctx.getBean(beanId,Engine.class);
		//start Engine
		engg.start();
		System.out.println("Viechle Moved...");
	}

}
