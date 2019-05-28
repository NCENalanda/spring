package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.beans.WishMsgGenerator;
import com.nt.config.AppConfig;

public class AnnotationConfigTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishMsgGenerator generator=null;
		//create IOC container
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	/*	//get bean
		generator=ctx.getBean("wish",WishMsgGenerator.class);
		//invoke method
		System.out.println(generator.generateWishMessage("Raja"));
		//close container
		((AbstractApplicationContext) ctx).close();*/
	}

}
