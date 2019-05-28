package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class ConstructorInjectionTest {
	public static void main(String[] args) {
		BeanFactory factory=null;
		WishMessageGenerator wish1=null;
		Resource res=null;
		//Locate Spring bean cfg file
		res=new ClassPathResource("applicationContext.xml");
		//create BeanFactory Container 
		factory=new XmlBeanFactory(res);
		//get Target/Main Bean obj
		//wish1=(WishMessageGenerator)factory.getBean("wish");
		wish1=factory.getBean("wish",WishMessageGenerator.class);
		//invoke the B.method
		System.out.println("Result==>"+wish1.generateWishMessage("Raja"));
		
	}

}
