package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.EngineeringCourse;

public class CollectionMergingTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		EngineeringCourse course=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		//create Reader
        reader=new XmlBeanDefinitionReader(factory);
        //load bean definations
        reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
        //get Bean
        course=factory.getBean("EC1stYear",EngineeringCourse.class);
        System.out.println(course);
	}//method
}//class
