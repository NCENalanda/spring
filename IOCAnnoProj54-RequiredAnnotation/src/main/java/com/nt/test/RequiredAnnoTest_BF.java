package com.nt.test;

import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Robot;

public class RequiredAnnoTest_BF {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Robot robot=null;
		RequiredAnnotationBeanPostProcessor bpp=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//register BeanPostProcessor explicitly
	/*	bpp=new RequiredAnnotationBeanPostProcessor();
		factory.addBeanPostProcessor(bpp);*/
		//get Bean
		robot=factory.getBean("robot",Robot.class);
		System.out.println(robot);

	}//main
}//class
