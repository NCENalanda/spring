package com.nt.test;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.BankIntrAmountCalculator;
import com.nt.beans.LoanDetails;
import com.nt.editors.CustomLoanDetailsEditor;

public class CustomPETest2 {
	 public static void main(String[] args) {
		 DefaultListableBeanFactory factory=null;
		 XmlBeanDefinitionReader reader=null;
		 BankIntrAmountCalculator bank=null;
		 //create  IOC container
		  factory=new DefaultListableBeanFactory();
		  reader=new XmlBeanDefinitionReader(factory);
		  reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		   //add Custom PERegistart to IOC container
		  factory.addPropertyEditorRegistrar(registry->{
			  registry.registerCustomEditor(LoanDetails.class,
					                                   new CustomLoanDetailsEditor());
		  });
		 //get Bean 
		 bank=factory.getBean("biac",BankIntrAmountCalculator.class);
		 
		 System.out.println("Intr Amount::"+bank.calcSimpleIntrAmount());
	 }
 
}//outer class
