package com.nt.test;

import java.util.Calendar;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class FactoryMethodsTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Calendar cal=null;
		Class  clazz=null; 
		String   first=null,second=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Beans...
		cal=factory.getBean("cal",Calendar.class);
		System.out.println(cal.getClass()+" --->data::"+cal.toString());
		System.out.println("------------------------------------------------------");

		clazz=factory.getBean("clazz",Class.class);
		System.out.println(clazz.getClass()+"-->data:: "+clazz.toString());
		System.out.println("---------------------------------------------------------");
		
		first=factory.getBean("s2",String.class);
		System.out.println(first.getClass()+"--->data::"+first);
		System.out.println("---------------------------------------------------------");
		
		second=factory.getBean("s3",String.class);
		System.out.println(second.getClass()+"--->data::"+second);
		System.out.println("---------------------------------------------------------");
		
	}//main
}//class
