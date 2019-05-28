package com.nt.pointcut;

import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import com.nt.target.IntrestAmountCalculator;

public class CommonDynaPoitcut extends DynamicMethodMatcherPointcut{

	@Override
	public boolean matches(Method method, Class<?> clazz, Object... args) {
		if(clazz==IntrestAmountCalculator.class && method.getName().equals("calcCompoundIntrAmount") && ((Float)args[0])>=100000)
		  return true;
		else
			return false;
	}

}
