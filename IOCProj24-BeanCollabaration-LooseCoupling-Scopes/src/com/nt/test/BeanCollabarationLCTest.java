package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Flipkart;

public class BeanCollabarationLCTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Flipkart fpkt=null,fpkt1=null,fpkt2=null;
		//create IOCContainer
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//get Bean
		fpkt=factory.getBean("fpkt",Flipkart.class);
		fpkt1=factory.getBean("fpkt",Flipkart.class);
		fpkt2=factory.getBean("fpkt",Flipkart.class);
		System.out.println(fpkt.hashCode()+"  "+fpkt1.hashCode()+" "+" "+fpkt2.hashCode());
		System.out.println((fpkt==fpkt1) +" "+(fpkt1==fpkt2));
		
		//fpkt.shooping(new String[]{"P-K","colors","color pump","sweets"});
	}//main
}//class
