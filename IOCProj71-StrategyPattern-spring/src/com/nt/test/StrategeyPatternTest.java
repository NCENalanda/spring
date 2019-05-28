package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.comps.JobSeeker;

public class StrategeyPatternTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		JobSeeker seeker=null;
		//create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//get Target Bean calss obj
		seeker=factory.getBean("seeker",JobSeeker.class);
		//invoke method
		System.out.println(seeker.applyJob("Infi"));
	}//main
}//class
