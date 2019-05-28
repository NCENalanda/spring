package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Bike;

public class BeanInheritenceTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Bike b1=null,b2=null,b3=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Beans
		b1=factory.getBean("pulsor1",Bike.class);
		System.out.println(b1);
		System.out.println("...............................");
		b2=factory.getBean("pulsor2",Bike.class);
		System.out.println(b2);
		System.out.println("...............................");
		b3=factory.getBean("pulsor3",Bike.class);
		System.out.println(b3);
		
		factory.getBean("basePulsor");
		
	}
}
