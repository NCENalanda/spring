package com.nt.test;

import java.util.Calendar;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;



public class FMBITest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		String s2=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get bEans
		Class cz=factory.getBean("cz",Class.class);
		System.out.println(cz.getClass()+"---->data "+cz.toString());
		System.out.println("---------------------------------");
		Calendar cal=factory.getBean("cal",Calendar.class);
		System.out.println(cal.getClass()+"---->data"+cal.toString());
		System.out.println("----------------------------------------------");
		s2=factory.getBean("s2",String.class);
		System.out.println(s2);
		System.out.println("-------------------------------------");
		String s3=factory.getBean("s3",String.class);
		System.out.println(s3.getClass()+" -->data "+s3);
		
		
	}
}
