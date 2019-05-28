package com.nt.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Cricketer {
	private String name;
	private String beanId;
	
	public void setBeanId(String beanId) {
		System.out.println("Crickter:setBeanId(-)");
		this.beanId = beanId;
	}

	public Cricketer() {
		System.out.println("Cricketer::0-param constructor");
	}

	public void setName(String name) {
		System.out.println("Crickter:setName(-)");
		this.name = name;
	}

	public void fielding() {
		System.out.println("Cricketer::"+name+"is fielding");
	}

	public void bowling() {
		System.out.println("Cricketer::"+name+" is bowling");
	}

	public void wicketKeeping() {
		System.out.println("Cricketer::"+name+" is wicket keeping");
	}
	public  void batting(DefaultListableBeanFactory factory){
		Bat bat=null;
		System.out.println("Cricketer: "+name+" is Batting....");
		 //Perform dependecny lookup
		 bat=factory.getBean(beanId,Bat.class);
		 //use Depedent class obj(Bat)
		 bat.strikingBall();
	}//method
}//class
