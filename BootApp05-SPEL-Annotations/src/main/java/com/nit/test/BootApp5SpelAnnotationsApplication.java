package com.nit.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.beans.ShoppingStore;
import com.nt.config.AppConfig;

@SpringBootApplication
@Import(value=AppConfig.class)
public class BootApp5SpelAnnotationsApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		ShoppingStore store=null;
		//get IOC container
		ctx=SpringApplication.run(BootApp5SpelAnnotationsApplication.class, args);
		//get Bean
		store=ctx.getBean("store",ShoppingStore.class);
		//invoke method
		System.out.println(store);
		//close container
		((ConfigurableApplicationContext) ctx).close();
	}
}
