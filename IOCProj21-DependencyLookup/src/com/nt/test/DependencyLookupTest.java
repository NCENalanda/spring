package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Viechle;

public class DependencyLookupTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Viechle viechle=null;
		//create IOC container
		System.out.println("clientApp: main(-)");
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Bean
		viechle=factory.getBean("viechle",Viechle.class);
		//invoke methods
		viechle.move();
		viechle.blowHorn();
		viechle.entertainment();
		
	}
}
