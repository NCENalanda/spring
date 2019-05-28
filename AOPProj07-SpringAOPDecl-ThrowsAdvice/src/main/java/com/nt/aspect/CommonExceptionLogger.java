package com.nt.aspect;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.ThrowsAdvice;

import com.nt.errors.InvalidInputsException;

public class CommonExceptionLogger implements ThrowsAdvice {

	public void  afterThrowing(IllegalArgumentException iae) throws Exception{
		System.out.println("CommonExceptionLogger.afterThrowing(2)");
		throw new IllegalAccessException(iae.toString()); 
	}

	public void  afterThrowing(Method method,Object args[],Object target ,IllegalArgumentException iae){
		System.out.println("CommonExceptionLogger.afterThrowing(1)");
		System.out.println(iae.toString()+" exception is raised in "+target.getClass()+" in a method"+method.getName()+" having args"+Arrays.toString(args));
	}
	
	
	/*public void  afterThrowing(Method method,Object args[],Object target ,IllegalArgumentException iae) throws Exception{
		System.out.println("1");
		throw new IllegalAccessException(iae.toString()); 
	}*/
	/*public void  afterThrowing(Method method,Object args[],Object target ,Exception iae) throws Exception{
		System.out.println("5");
		throw new IllegalAccessException(iae.toString()); 
	}*/
	/*public void  afterThrowing(Method method,Object args[],Object target ,Throwable iae) throws Exception{
		System.out.println("6");
		throw new IllegalAccessException(iae.toString()); 
	}
*/
	
/*	public void  afterThrowing(Exception iae) throws Exception{
		System.out.println("3");
		throw new IllegalAccessException(iae.toString()); 
	}
*/	/*public void  afterThrowing(Throwable iae) throws Exception{
		System.out.println("4");
		throw new IllegalAccessException(iae.toString()); 
	}*/
	
	
	
	
/*	public void  afterThrowing(Method method,Object args[],Object target ,IllegalAccessException iae) {
		System.out.println(iae.toString()+" exception is raised in "+target.getClass()+" in a method"+method.getName()+" having args"+Arrays.toString(args));
		throw new InvalidInputsException(iae.getMessage()) ;
	}
*/
}
