package com.nt.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class SpecialDaysDiscount implements MethodReplacer {
	private float gst;

	
	public SpecialDaysDiscount(float gst) {
		this.gst = gst;
	}
	
	


	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("MethodReplacer::reimpliments(-,-,-)");
		float basePrice = 0.0f;

		basePrice = (float) args[0];
		
		return (basePrice+ (basePrice* gst/100.0f));
	}

}
