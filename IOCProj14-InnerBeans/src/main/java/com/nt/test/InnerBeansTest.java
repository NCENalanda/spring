package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Person;

public class InnerBeansTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Person person=null,person1=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		//read spring Bean cfg file
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get bean 
		person=factory.getBean("com.nt.beans.Person#0",Person.class);
		System.out.println(person);
		System.out.println("--------------------------");
		person1=factory.getBean("com.nt.beans.Person#1",Person.class);
		System.out.println(person1);
		//factory.getBean("dt");
		//factory.getBean("person.paspt");
		
		
	}

}
