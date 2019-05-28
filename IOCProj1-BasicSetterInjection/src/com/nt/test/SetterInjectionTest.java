package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		System.out.println("main(-) method..");
		Resource res=null;
		BeanFactory factory=null;
		Object obj=null;
		WishGenerator wg=null,wg1=null;
	  //Locate Spring Bean cfg file
		res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		System.out.println("SpringBean cfg file is located");
	 //create IOC container
		factory=new XmlBeanFactory(res);
		System.out.println("IOC Container of type BeanFactory Created");
		//get target class object
		obj=factory.getBean("wish");
		System.out.println("taget class obj injected with Depedent class obj is gathered");
		System.out.println("------------------------------");
		//type casting
		wg=(WishGenerator)obj;
		//invoke method
		System.out.println("Wish Message:::::"+wg.generateWishMessage("raja"));
	
	}//main
}//class
