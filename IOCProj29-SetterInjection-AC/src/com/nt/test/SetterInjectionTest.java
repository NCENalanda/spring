package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		WishMessageGenerator wish=null;
		ApplicationContext ctx=null;
		//create ApplicationContext container
		//ctx=new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean
		wish=ctx.getBean("wish",WishMessageGenerator.class);
		System.out.println(wish.generateWishMessage("raja"));
		
		//close container
		((AbstractApplicationContext) ctx).close();
		
	}//main
}//class
