package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.OnlineStore;

public class AfterAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		OnlineStore proxy=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Proxu obj
		proxy=ctx.getBean("pfb",OnlineStore.class);
		//invoke method
		System.out.println("Bill Amount::"+proxy.shopping(new String[]{"pot","cooler","handfan","sun glasses"}));
		///close container
		((AbstractApplicationContext) ctx).close();
	}

}
