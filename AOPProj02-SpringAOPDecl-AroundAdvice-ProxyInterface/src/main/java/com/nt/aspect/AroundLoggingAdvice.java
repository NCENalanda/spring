package com.nt.aspect;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundLoggingAdvice implements MethodInterceptor {
	

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object retVal=null;
		Object args[]=null;
		System.out.println("Entering into "+invocation.getMethod().getName()+" with args"+Arrays.toString(invocation.getArguments()));
		//modify method argument values
		args=invocation.getArguments();
		if(((Float)args[0])<=100000 && ((Float)args[2]<=12)){
			args[1]=((Float)args[1])-0.5f;
		}
		
		//Controlling target method execution
		if((Float)args[0]<=0 ||(Float)args[1]<=0 ||(Float)args[2]<=0)
			throw new IllegalArgumentException("Invalid arguments..");
		else
	    retVal=invocation.proceed();
		
	    System.out.println("Exiting  "+invocation.getMethod().getName()+" with args"+Arrays.toString(invocation.getArguments()));
	  //modify method return value
	    retVal=((Float)retVal)+((Float)retVal)*0.01f;
		return retVal;
	}

}
