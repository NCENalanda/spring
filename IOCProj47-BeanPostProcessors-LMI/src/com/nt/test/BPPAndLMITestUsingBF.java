package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.bpp.BODOJBeanPostProccessor;
import com.nt.service.CollegeService;

public class BPPAndLMITestUsingBF {

	public static void main(String[] args) {
        DefaultListableBeanFactory factory=null;
        XmlBeanDefinitionReader reader=null;
		CollegeService service=null;
		BODOJBeanPostProccessor bdbpp=null;
		 //create IOC container
        factory=new DefaultListableBeanFactory();
        reader=new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
        //register BeanPostProcessor explicitly
        bdbpp=new BODOJBeanPostProccessor();
        factory.addBeanPostProcessor(bdbpp);
		//get Bean
		service=factory.getBean("clgService",CollegeService.class);
		//invoke method
		System.out.println(service.registerEmployee(101,"raja", "programmer"));
		System.out.println(service.registerStudent(102,"rani", "spring"));
		System.out.println("----------------------------------------------------------");
		System.out.println(service.registerEmployee(103,"jani", "Hardaware Engg"));
		System.out.println(service.registerStudent(104,"begum", "coreJava"));
	
	}
}
