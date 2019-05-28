package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Customer;
import com.nt.beans.Marks;
import com.nt.beans.Student;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Student st=null;
		Marks mk=null;
		Customer cust=null;
		//create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//get BEan 
		st=factory.getBean("st",Student.class);
		System.out.println("Student data:::"+st);
		System.out.println("-------------------------------");
		mk=factory.getBean("mk",Marks.class);
		System.out.println("Marks are ::"+mk);
		System.out.println("-----------------------------");
		cust=factory.getBean("cust",Customer.class);
		System.out.println(cust);
		
	}//main
}//class
