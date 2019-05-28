package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.OnLineShoppingStore;

public class AspectJAOPAfterAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		OnLineShoppingStore proxy=null;
     //create IOC contianer
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Proxy obj
		proxy=ctx.getBean("shoppingStore",OnLineShoppingStore.class);
		System.out.println("Bill amount::"+proxy.shopping(new String[]{"red","green","sprayGun"}));
		//close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
