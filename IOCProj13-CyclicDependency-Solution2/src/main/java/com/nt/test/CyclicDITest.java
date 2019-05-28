package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.A;
import com.nt.beans.B;

public class CyclicDITest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		B  b=null;
		A a=null;
		//create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//get Bean
		//b=factory.getBean("b1",B.class);
		a=factory.getBean("a1",A.class);
		//System.out.println(a);
		
	}//main
}//class
