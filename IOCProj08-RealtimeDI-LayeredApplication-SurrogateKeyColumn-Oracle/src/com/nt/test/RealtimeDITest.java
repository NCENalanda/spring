package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.controller.EmployeeController;

public class RealtimeDITest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		EmployeeController controller=null;
		 //create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//get EmployeeController class object
		controller=factory.getBean("empController",EmployeeController.class);
		try{
		//invoke B.method
		System.out.println("result:::"+controller.process("raja","9000"));
		}
		catch(Exception e){
			System.out.println("Internal Problem Try Again-->"+e.getMessage());
		}

	}//main
}//class
