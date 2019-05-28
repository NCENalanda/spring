package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.AadharCard;

public class NullInjectionTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		AadharCard rajaCard=null;
		AadharCard raoCard=null;
		
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Bean
		rajaCard=factory.getBean("rajaAadhar",AadharCard.class);
		System.out.println(rajaCard);
		System.out.println(".................................");
		raoCard=factory.getBean("raoAadhar",AadharCard.class);
		System.out.println(raoCard);
		

	}

}
