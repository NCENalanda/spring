package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Flipkart;
import com.nt.config.AppConfig;

public class DIAndLooseCouplingTest {

	public static void main(String[] args) {
		 ApplicationContext ctx=null;
		 Flipkart fpkt=null;
		//create IOC container
		 ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		 //get Bean
		 fpkt=ctx.getBean("fpkt",Flipkart.class);
		 //invoke methods
		 fpkt.shopping(new String[]{"shirt","trouser","belt"});
		 
		 //close IOC container
		 ((AbstractApplicationContext) ctx).close();
		

	}

}
