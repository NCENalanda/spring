package com.nt.test;

import java.util.Date;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishGenerator;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		System.out.println("main(-) method..");
		Resource res=null;
		BeanFactory factory=null;
		WishGenerator wg=null;
	  //Locate Spring Bean cfg file
		//res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		//res=new FileSystemResource("E:\\Spring\\NTSP69\\IOCProj2-ConstructorInjection2\\src\\com\\nt\\cfgs\\applicationContext.xml");
		 //res=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
		res=new ClassPathResource("applicationContext.xml");
		System.out.println("SpringBean cfg file is located");
	 //create IOC container
		factory=new XmlBeanFactory(res);
		System.out.println("IOC Container of type BeanFactory Created");
		//get target class object
		wg=factory.getBean("com.nt.beans.WishGenerator#0",WishGenerator.class);
		System.out.println("taget class obj injected with Depedent class obj is gathered");
		System.out.println("------------------------------");
		
	
		//invoke method
		System.out.println("Wish Message:::::"+wg.generateWishMessage("raja"));
	
	}//main
}//class
