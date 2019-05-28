package com.nt.test;

import org.springframework.aop.framework.ProxyFactory;

import com.nt.aspect.CacheAdvice;
import com.nt.aspect.PerformanceMonitoringAdvice;
import com.nt.service.ArithmeticOperations;

public class SpringAOPProgramaticTest {

	public static void main(String[] args) {
		ArithmeticOperations airth=null,proxy=null;
		PerformanceMonitoringAdvice pmAdvice=null;
		CacheAdvice cAdvice=null;
		ProxyFactory  factory=null;
		
		//create Target class object
		airth=new ArithmeticOperations();
		//create Advice class object
		pmAdvice=new PerformanceMonitoringAdvice();
		cAdvice=new CacheAdvice();
		//create ProxyFactory class object and get Proxy class object
		factory=new ProxyFactory();
		factory.setTarget(airth);
	
		factory.addAdvice(cAdvice);
		factory.addAdvice(pmAdvice);
		/*factory.addAdvice(0,cAdvice);
		factory.addAdvice(1,pmAdvice);
		*/
	
		//get Proxy class object
		proxy=(ArithmeticOperations) factory.getProxy();
		System.out.println("Proxy object class name::"+proxy.getClass());
		//invoke methods..
		System.out.println("Add=="+proxy.add(10, 20));
		System.out.println("------------------------------------");
		System.out.println("Add=="+proxy.add(10, 20));
		System.out.println("------------------------------------");
		System.out.println("Sub=="+proxy.sub(10, 20));
		System.out.println("------------------------------------");
		System.out.println("Mul=="+proxy.mul(10, 20));
		System.out.println("------------------------------------");
		System.out.println("Div=="+proxy.div(20, 10));
		System.out.println("------------------------------------");
	}//main
}//class
