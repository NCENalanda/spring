package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.CheckVotingElgibility;

public class BeanLifeCycleTest1 {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		CheckVotingElgibility voting=null;
		//create IOC container
	   factory=new DefaultListableBeanFactory();
	   reader=new XmlBeanDefinitionReader(factory);
	   reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
	/*	//get Bean
		voting=factory.getBean("cve",CheckVotingElgibility.class);
		//invoke b.method
		System.out.println(voting.checkVotingElgibility());
		//factory.destroySingletons();
		factory.destroySingleton("cve");*/
	}

}
