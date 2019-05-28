package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.AsianPaints;
import com.nt.beans.ClassRoom;
import com.nt.beans.Faculty;
import com.nt.beans.FruitInfo;
import com.nt.beans.User;

public class CollectionInjectionTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		AsianPaints ap=null;
		ClassRoom room=null;
		User user=null;
		Faculty faculty=null;
		FruitInfo info=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Bean
		ap=factory.getBean("ap",AsianPaints.class);
		System.out.println(ap);
		System.out.println("--------------------------------------");
		room=factory.getBean("cr",ClassRoom.class);
		System.out.println(room);
		System.out.println("--------------------------------------");
		user=factory.getBean("user",User.class);
		System.out.println(user);
		System.out.println("--------------------------------------");
		faculty=factory.getBean("faculty",Faculty.class);
		System.out.println(faculty);
		System.out.println("------------------------------------");
		info=factory.getBean("fi",FruitInfo.class);
		System.out.println(info);
		
	}//main
}//class
