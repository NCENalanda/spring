package com.nt.test;

import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Person;

public class RequiredAnnoTest1 {

	public static void main(String[] args) {
		 DefaultListableBeanFactory  factory=null;
		 XmlBeanDefinitionReader reader=null;
		 Person per=null;
		//create IOC Container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//register BPP
		factory.addBeanPostProcessor(new RequiredAnnotationBeanPostProcessor());
		//get Bean
		per=factory.getBean("per",Person.class);
		System.out.println(per);
		
	}//main
}//class
