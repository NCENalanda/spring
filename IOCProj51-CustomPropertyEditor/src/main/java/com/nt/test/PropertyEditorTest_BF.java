package com.nt.test;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.AmountDetails;
import com.nt.beans.IntrestAmountCalculator;
import com.nt.editors.AmountDetailsPropertyEditor;

public class PropertyEditorTest_BF {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		IntrestAmountCalculator iac=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//add CustomPropertyEditorRegistar
		factory.addPropertyEditorRegistrar(new MyPEditorRegistar());
		//get Bean class obj
		iac=factory.getBean("iac",IntrestAmountCalculator.class);
		//invoke method
		System.out.println("Intrest Amount:::"+iac.calcIntrestAmount());
	}
	
	private static  class MyPEditorRegistar implements PropertyEditorRegistrar {
		@Override
		public void registerCustomEditors(PropertyEditorRegistry registry) {
		  registry.registerCustomEditor(AmountDetails.class,new AmountDetailsPropertyEditor());
		}
	}
}
