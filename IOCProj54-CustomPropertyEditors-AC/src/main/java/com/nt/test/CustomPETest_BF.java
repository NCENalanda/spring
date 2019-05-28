package com.nt.test;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.BankIntrAmountCalculator;
import com.nt.beans.LoanDetails;
import com.nt.editors.CustomLoanDetailsEditor;

public class CustomPETest_BF {
	 public static void main(String[] args) {
      DefaultListableBeanFactory factory=null;
      XmlBeanDefinitionReader reader=null;
		 BankIntrAmountCalculator bank=null;
		 BeanFactoryPostProcessor processor=null;
		 //create  IOC container
		  factory=new DefaultListableBeanFactory();
		  reader=new XmlBeanDefinitionReader(factory);
		  reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		  //Get CustomEditorConfigurer Bean(BFPP) & register
		  processor=factory.getBean("cec",BeanFactoryPostProcessor.class);
		  processor.postProcessBeanFactory(factory);
		 //get Bean 
		 bank=factory.getBean("biac",BankIntrAmountCalculator.class);
		 
		 System.out.println("Intr Amount::"+bank.calcSimpleIntrAmount());
	 }
 }//outer class
