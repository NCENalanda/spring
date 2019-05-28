package com.nt.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Cricketer {
	private String name;
	
	public Cricketer() {
		System.out.println("Cricketer::0-param constructor");
	}

	public void setName(String name) {
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
	public  void batting(){
		System.out.println("Cricketer: "+name+" is Batting....");
		 DefaultListableBeanFactory factory=null;
		 XmlBeanDefinitionReader reader=null;
		 Bat bat=null;
		 //create IOC container
		 factory=new DefaultListableBeanFactory();
		 reader=new XmlBeanDefinitionReader(factory);
		 reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		 //Perform dependecny lookup
		 bat=factory.getBean("bat",Bat.class);
		 //use Depedent class obj(Bat)
		 bat.strikingBall();
	}//method
}//class
