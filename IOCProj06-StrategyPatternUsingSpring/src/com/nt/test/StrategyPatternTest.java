package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Viechle;

public class StrategyPatternTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Viechle viechle=null;
		//create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//get Bean (Viechle class obj)
		viechle=factory.getBean("viechle",Viechle.class);
		//invoke methods...
		viechle.move();
		System.out.println("-------------------------------------");
		viechle.parking();
	}//main
}//class
