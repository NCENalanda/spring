package com.nt.test;

import java.lang.reflect.Method;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;

import com.nt.aspect.PerformanceMonitoringAdvice;
import com.nt.pointcut.CommonArithmeticPointcut;
import com.nt.service.ArithmeticOperations;

public class SpringAOPProgramaticTest {

	public static void main(String[] args) {
		ArithmeticOperations airth=null;
		ArithmeticOperations proxy=null;
		PerformanceMonitoringAdvice pmAdvice=null;
		ProxyFactory  factory=null;
		DefaultPointcutAdvisor  advisor=null;
		NameMatchMethodPointcut nmPTC=null;
		
		//create Target class object
		airth=new ArithmeticOperations();
		//create Advice class object
		pmAdvice=new PerformanceMonitoringAdvice();
		//create ProxyFactory class object and get Proxy class object
		factory=new ProxyFactory();
		factory.setTarget(airth);
		
		NameMatchMethodPointcutAdvisor nmAdvisor=new NameMatchMethodPointcutAdvisor(pmAdvice);
		nmAdvisor.addMethodName("mul");
		nmAdvisor.addMethodName("add");
		factory.addAdvisor(nmAdvisor);
		
		
		
		
		/*//create pointcut
		nmPTC=new NameMatchMethodPointcut();
		nmPTC.setMappedNames("add","mul");
		//create Advisor class object
		advisor=new DefaultPointcutAdvisor(nmPTC,pmAdvice);
		//advisor=new DefaultPointcutAdvisor(new CommonArithmeticPointcut(),pmAvice);
		factory.addAdvisor(advisor);*/
		
		//get Proxy class object
		proxy=(ArithmeticOperations) factory.getProxy();

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
