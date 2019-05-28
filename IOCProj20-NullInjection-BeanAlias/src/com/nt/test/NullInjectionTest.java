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
		rajaCard=factory.getBean("uid1",AadharCard.class);
		System.out.println(rajaCard);
		System.out.println("____________________");
		rajaCard=factory.getBean("rid1",AadharCard.class);
		System.out.println(rajaCard);
		
		System.out.println(".................................");
		raoCard=factory.getBean("ano2",AadharCard.class);
		System.out.println(raoCard);
		System.out.println("__________________________");
		/*raoCard=factory.getBean("rid2",AadharCard.class);
		System.out.println(raoCard);*/
		System.out.println("__________________________");
		raoCard=factory.getBean("rid3",AadharCard.class);
		System.out.println(raoCard);
		
		
		

	}

}
