package com.nt.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component("allAdvices")
public class AllAdivces {
	
	
	@Pointcut("execution(* com.nt.service.*.*(..))")
	public  void myPtc(){
	}
	
	
	@Around("myPtc()")
	public  Object  log(ProceedingJoinPoint pjp) throws Throwable{
		Object retVal=null;
		  System.out.println("Entering into "+pjp.getSignature()+" with args"+Arrays.toString(pjp.getArgs()));
		  retVal=pjp.proceed();
		  System.out.println("Exiting from "+pjp.getSignature()+" with args"+Arrays.toString(pjp.getArgs()));
		  return retVal;
	}
	
	@Before("myPtc()")
	public void  before(JoinPoint jp) throws Throwable{
		  System.out.println("Before Entering into "+jp.getSignature()+" with args"+Arrays.toString(jp.getArgs()));
	}
	
	@AfterReturning(value="myPtc()",returning="result")
	public  void  after(JoinPoint jp, int result){
		  System.out.println("exceuted  "+jp.getSignature()+" with args"+Arrays.toString(jp.getArgs())+" and result is"+result);
	}
	
	@AfterThrowing(value="myPtc()",throwing="e")
	public  void  exceptionLogger(JoinPoint jp, Exception e){
		  System.out.println(e+" exception is raised in  "+jp.getSignature()+" with args"+Arrays.toString(jp.getArgs()));
	}


}
