package com.nt.replacer;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.beans.factory.support.MethodReplacer;

public class IntrRateReplacer implements MethodReplacer {
	private float rate;

	public void setRate(float rate) {
		this.rate = rate;
	}
	@Override
	public Object reimplement(Object bean, Method method, Object[] args) throws Throwable {
		float pAmt=0.0f,time=0.0f;
		System.out.println("IntrRateReplacer:reimplement(-,-,-)");
		System.out.println("method name"+method.getName()+" class name"+bean.getClass()+"args::"+Arrays.toString(args));
		pAmt=(float)args[0];
		time=(float)args[1];
		//calc IntrAmount with discount rate of intrest
		 return  (pAmt*time*rate)/100.0f;
	}//reimplement(-,-,-)
}//class
