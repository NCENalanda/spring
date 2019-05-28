package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Flipkart;

public class BeanCollabarationTCTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Flipkart fpkt=null;
		//create IOCContainer
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//get Bean
		fpkt=factory.getBean("fpkt",Flipkart.class);
		fpkt.shooping(new String[]{"P-K","colors","color pump","sweets"});
	}//main
}//class
