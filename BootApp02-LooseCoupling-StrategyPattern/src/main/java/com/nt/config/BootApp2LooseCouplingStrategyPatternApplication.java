package com.nt.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.beans.Flipkart;

@SpringBootApplication
@Import(value = AppConfig.class)
public class BootApp2LooseCouplingStrategyPatternApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Flipkart fpkt=null;
		ctx=SpringApplication.run(BootApp2LooseCouplingStrategyPatternApplication.class, args);
		//get Bean
		fpkt=ctx.getBean("fpkt",Flipkart.class);
		fpkt.shopping(new String[] {"flag","thread","flowers","sweets"});
		//close container
		((ConfigurableApplicationContext) ctx).close();
	}
}
