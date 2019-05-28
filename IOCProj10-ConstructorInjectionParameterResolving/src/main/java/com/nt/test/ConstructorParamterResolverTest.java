package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Customer;
import com.nt.beans.Marks;
import com.nt.beans.Student;

public class ConstructorParamterResolverTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Student st=null;
		Marks mk=null;
		Customer cust=null;
		//create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//get Bean
		st=factory.getBean("st",Student.class);
		mk=factory.getBean("mk",Marks.class);
		cust=factory.getBean("cust",Customer.class);
		System.out.println(st);
		System.out.println(mk);
		System.out.println(cust);
	}//main
}//class
