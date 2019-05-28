package com.nt.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class CalcSimpleIntrAmountMethodReplacer implements MethodReplacer {
	private  float rate;
	
	 public CalcSimpleIntrAmountMethodReplacer(float rate) {
		this.rate = rate;
	}
	@Override
	public Object reimplement(Object bean, Method method, Object[] args) throws Throwable {
		System.out.println("MethodReplacer::: reimplement(-,-,-)");
      float pAmt=0.0f , time=0.0f;
      pAmt=(float)args[0];
      time=(float)args[1];
      return (pAmt*rate*time)/100.0f;
	}
}
