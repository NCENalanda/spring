package com.nt.test;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.BankIntrAmountCalculator;
import com.nt.beans.LoanDetails;
import com.nt.editors.CustomLoanDetailsEditor;

public class CustomPETest_AC {
	 public static void main(String[] args) {
        ApplicationContext ctx=null;		 
		 BankIntrAmountCalculator bank=null;
		 //create  IOC container
		  ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		 //get Bean 
		 bank=ctx.getBean("biac",BankIntrAmountCalculator.class);
		 
		 System.out.println("Intr Amount::"+bank.calcSimpleIntrAmount());
		 
		 //close container
		 ((AbstractApplicationContext) ctx).close();
	 }
 }//outer class
