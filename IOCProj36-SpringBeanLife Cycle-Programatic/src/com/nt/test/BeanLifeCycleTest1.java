package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.CheckVotingElgibility;

public class BeanLifeCycleTest1 {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		CheckVotingElgibility voter=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get bean
		voter=factory.getBean("voter",CheckVotingElgibility.class);
		voter=factory.getBean("voter",CheckVotingElgibility.class);
		System.out.println(voter.checkElgibility());
	
		//close container
		//factory.destroySingletons();
		factory.destroyBean(voter);
		
		
   }//main
}//class
