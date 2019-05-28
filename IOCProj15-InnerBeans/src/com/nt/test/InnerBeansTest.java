package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.BatsMan;

public class InnerBeansTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		BatsMan  batter=null;
		//create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//get Target bean class obj
		batter=factory.getBean("kohli",BatsMan.class);
		System.out.println(batter.hitRuns());
		
		
		
	}
}
