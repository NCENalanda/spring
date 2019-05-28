package com.nt.test;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.BankIntrAmountCalculator;
import com.nt.beans.LoanDetails;
import com.nt.editors.CustomLoanDetailsEditor;

public class CustomPETest {
	 public static void main(String[] args) {
		 BeanFactory factory=null;
		 BankIntrAmountCalculator bank=null;
		 //create  IOC container
		 factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		   //add Custom PERegistart to IOC container
		 ((ConfigurableListableBeanFactory)factory).addPropertyEditorRegistrar(new MyPERegistar());
		 //get Bean 
		 bank=factory.getBean("biac",BankIntrAmountCalculator.class);
		 
		 System.out.println("Intr Amount::"+bank.calcSimpleIntrAmount());
	 }
	 
	 private static class MyPERegistar implements PropertyEditorRegistrar{

		@Override
		public void registerCustomEditors(PropertyEditorRegistry peRegistry) {
			 peRegistry.registerCustomEditor(LoanDetails.class,new CustomLoanDetailsEditor() );
		}//method
	 }//inner class
}//outer class
