package com.nt.aspect;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;
@Component("cacheAdvice")
public class CacheAdvice implements MethodInterceptor {
	 private Map<String,Object> cache=new HashMap();
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		String key=null;
		Object retVal=null;
		key=invocation.getMethod().getName()+Arrays.toString(invocation.getArguments());
		if(!cache.containsKey(key)){
			//invoke target method
			retVal=invocation.proceed();
			System.out.println("from taget method");
			cache.put(key, retVal);
		}
		return cache.get(key);
	}

}
