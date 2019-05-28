package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		WishMessageGenerator wish=null,wish1=null;
		//Locate SpringBean cfg file
		//res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		 res=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
		//create IOC Container (BeanFactory)
        factory=new XmlBeanFactory(res);
        //get MainBean class obj
      wish=(WishMessageGenerator)factory.getBean("wish");
      System.out.println("---------------------------------");
      wish1=(WishMessageGenerator)factory.getBean("wish");
      System.out.println(wish.hashCode()+"...."+wish1.hashCode());
      System.out.println("wish==wish1?"+(wish==wish1));
        //invoke b.methods
     System.out.println("Wish Message::"+wish.generateWishMessage("raja")); 
        
	}//main
}//class
