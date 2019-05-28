package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.beans.JobSeeker;

public class StrategeyPatternTestBF {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
       XmlBeanDefinitionReader reader=null;
		 JobSeeker seeker=null;
		 //create IOC container
		 factory=new DefaultListableBeanFactory();
		 reader=new XmlBeanDefinitionReader(factory);
		 reader.loadBeanDefinitions("applicationContext.xml");
		//get Bean
		 /*seeker=factory.getBean("seeker",JobSeeker.class);
		 System.out.println(seeker.applyJob("HCL"));*/
		 
		 //close container
		// ((AbstractApplicationContext) ctx).close();
		 
	   }
	}