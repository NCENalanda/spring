package com.nt.config;

import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.nt.beans.WishGenerator;

@SpringBootApplication
@ComponentScan(basePackages="com.nt.beans")
public class BootApp1DiApplication {
	
	@Bean(name="cal")
	public Calendar  createCalendar(){
		return Calendar.getInstance();
	}

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishGenerator wish=null;
		//get IOCcontainer
		ctx=SpringApplication.run(BootApp1DiApplication.class, args);
		//get bEan 
		wish=ctx.getBean("wg",WishGenerator.class);
		//invoke business method
		System.out.println("WishMessage:::"+wish.generateWishMessage("raja"));
		
		//close container
		((ConfigurableApplicationContext) ctx).close();
		
	}
}
