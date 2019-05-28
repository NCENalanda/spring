package com.nt.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class ATMPinVerifier implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object retVal, Method method, Object[] args, Object target) throws Throwable {
		int pinNumber=0;
		
		pinNumber=(Integer)retVal;
		if(pinNumber<=999)
			throw new IllegalArgumentException("weak Pin Number is generated");
	}//method
}//class
