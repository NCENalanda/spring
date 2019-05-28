package com.nt.replacer;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.beans.factory.support.MethodReplacer;

public class IntrAmountReplacer implements MethodReplacer {
	private float rate;

	public void setRate(float rate) {
		this.rate = rate;
	}

	@Override
	public Object reimplement(Object bean, Method method, Object[] args) throws Throwable {
		System.out.println("IntrAmountReplacer:: reimplement(-,-,-)");
		System.out.println(bean.getClass()+"  "+method.getName()+" "+Arrays.toString(args));
		 float pAmt=0.0f,time=0.0f;
		 float intrAmt=0.0f;
		//get  Target method arg values
		 pAmt=((Float)args[0]);
		 time=((Float)args[1]);
		 intrAmt=(pAmt*time*rate)/100.0f;
		return intrAmt;
	}

}
