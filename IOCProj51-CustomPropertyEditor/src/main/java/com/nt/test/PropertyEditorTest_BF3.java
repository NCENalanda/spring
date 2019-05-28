package com.nt.test;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.AmountDetails;
import com.nt.beans.IntrestAmountCalculator;
import com.nt.editors.AmountDetailsPropertyEditor;

public class PropertyEditorTest_BF3 {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		IntrestAmountCalculator iac=null;
		CustomEditorConfigurer cec;
		
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
	    //get Access to CustomerEditorConfigure
		cec=factory.getBean("cec",CustomEditorConfigurer.class);
		cec.postProcessBeanFactory(factory);
		//get Bean class obj
		iac=factory.getBean("iac",IntrestAmountCalculator.class);
		//invoke method
		System.out.println("Intrest Amount:::"+iac.calcIntrestAmount());
	}
}
