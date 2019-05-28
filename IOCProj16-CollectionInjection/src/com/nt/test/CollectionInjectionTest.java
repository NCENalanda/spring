package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.CountryClub;
import com.nt.beans.FacultyInfo;
import com.nt.beans.FruitStore;
import com.nt.beans.PhoneBook;
import com.nt.beans.Student;

public class CollectionInjectionTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Student st=null;
		CountryClub club=null;
		PhoneBook pb=null;
		FacultyInfo fInfo=null;
		FruitStore fStore=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		//create Reader
		reader=new XmlBeanDefinitionReader(factory);
		//load XML definations..
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Bean
		st=factory.getBean("st",Student.class);
		System.out.println(st);
		System.out.println("............................");
         club=factory.getBean("cc",CountryClub.class);
         System.out.println(club);
         System.out.println("...........................");
         pb=factory.getBean("pb",PhoneBook.class);
         System.out.println(pb);
         System.out.println("...............................");
         fInfo=factory.getBean("fi",FacultyInfo.class);
         System.out.println(fInfo);
         System.out.println("........................");
         fStore=factory.getBean("fStore",FruitStore.class);
         System.out.println(fStore);
	}
}
