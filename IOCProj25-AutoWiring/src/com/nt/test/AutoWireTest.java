package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.SportsPerson;

public class AutoWireTest {

	public static void main(String[] args) {
	 DefaultListableBeanFactory factory=null;
	 XmlBeanDefinitionReader reader=null;
	 SportsPerson person=null;
		//crete IOC container
	 factory=new DefaultListableBeanFactory();
	 reader=new XmlBeanDefinitionReader(factory);
	 reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
	 //get Bean
	 person=factory.getBean("spPerson",SportsPerson.class);
	 System.out.println(person);
	 
	}//main
}//class
