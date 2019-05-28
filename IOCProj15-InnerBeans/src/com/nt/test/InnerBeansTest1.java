package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.BatsMan;

public class InnerBeansTest1 {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		
		XmlBeanDefinitionReader reader=null;
		BatsMan  batter=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		//create XMLBeanDefiniationReader
		reader=new XmlBeanDefinitionReader(factory);
		//load xml file data
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Target bean class obj
		batter=factory.getBean("kohli",BatsMan.class);
		System.out.println(batter.hitRuns());
	}
}
