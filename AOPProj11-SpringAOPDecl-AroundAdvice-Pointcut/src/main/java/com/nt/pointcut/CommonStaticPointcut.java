package com.nt.pointcut;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

import com.nt.target.IntrestAmountCalculator;

public class CommonStaticPointcut extends StaticMethodMatcherPointcut {

	@Override
	public boolean matches(Method method, Class<?> clazz) {
		if(method.getName().equalsIgnoreCase("calcSimpleIntrAmount") && clazz==IntrestAmountCalculator.class)
			return true;
		else
		return false;
	}

}
