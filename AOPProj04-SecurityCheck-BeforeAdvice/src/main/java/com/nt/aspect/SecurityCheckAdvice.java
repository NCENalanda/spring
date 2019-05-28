package com.nt.aspect;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class SecurityCheckAdvice implements MethodBeforeAdvice {
	private AuthenticationManager manager;

	public SecurityCheckAdvice(AuthenticationManager manager) {
		this.manager = manager;
	}

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
       boolean flag=false;
       flag=manager.validate();
       if(flag==false)
    	   throw new IllegalAccessException("Invalid Credentials");
	}

}
