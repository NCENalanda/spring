package com.nit.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.config.AppConfig;
import com.nt.service.BankService;

@SpringBootApplication
@Import(value=AppConfig.class)
public class BootApp11TxMgmtSpringAop4Application {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService proxy=null;
		ctx=SpringApplication.run(BootApp11TxMgmtSpringAop4Application.class, args);
		//get Proxy object
		proxy=ctx.getBean("tpfb1Proxy",BankService.class);
		
		//invoke b.method
		try{
			System.out.println("Money transfffered::"+proxy.transferMoney(1001, 10332,300));
		}
		catch(Exception e){
			System.out.println("Money not transffered");
			e.printStackTrace();
		}
		
		
		//close the container
		((ConfigurableApplicationContext) ctx).close();
		
	}
}
