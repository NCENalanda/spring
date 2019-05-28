package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Cricketer;

public class DepedencyLookupTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Cricketer cktr=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Target Bean
		cktr=factory.getBean("cktr",Cricketer.class);
		cktr.batting();
		System.out.println("----------------------");
		cktr.bowling();
		System.out.println("----------------------");
		cktr.fielding();
		System.out.println("----------------------");
		cktr.wicketKeeping();
		System.out.println("----------------------");
	}

}
