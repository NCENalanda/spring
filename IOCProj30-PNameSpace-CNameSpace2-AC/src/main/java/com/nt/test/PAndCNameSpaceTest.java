package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.beans.Employee;


public class PAndCNameSpaceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Employee emp;
		//create IOC container
		//ctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean
		emp=ctx.getBean("emp",Employee.class);
		System.out.println(emp);
		//close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
