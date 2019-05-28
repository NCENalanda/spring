package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.beans.Hotel;
import com.nt.config.AppConfig;

@SpringBootApplication
@Import(value=AppConfig.class)
public class BootApp4MethodReplacerApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
	   Hotel hotel=null;
		ctx=SpringApplication.run(BootApp4MethodReplacerApplication.class, args);
		//get Bean
		hotel=ctx.getBean("hotel",Hotel.class);
		//invoke method
		System.out.println("Hotel Price::"+hotel.calHotelPrice(900));
		//close container
		((ConfigurableApplicationContext) ctx).close();
		
	}
}
