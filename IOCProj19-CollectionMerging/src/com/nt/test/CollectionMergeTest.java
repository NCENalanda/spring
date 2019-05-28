package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.EnggCourse;

public class CollectionMergeTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		EnggCourse  eceCourse1=null, csCourse2=null;
		//create IOC Container
		factory=new DefaultListableBeanFactory();
		//create Reader
		reader=new XmlBeanDefinitionReader(factory);
		//load xml file
		reader.loadBeanDefinitions("/com/nt/cfgs/applicationContext.xml");
		//get Bean objs
		eceCourse1=factory.getBean("ece1stYear",EnggCourse.class);
		System.out.println(eceCourse1);
		System.out.println("--------------------------");
		csCourse2=factory.getBean("cs1stYear",EnggCourse.class);
		System.out.println(csCourse2);
		
		
		
		

	}

}
