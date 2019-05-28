package com.nt.bpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
	
	public MyBeanPostProcessor() {
		System.out.println("MyBeanPostProcessor:0-param constructor()");
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
	    System.out.println("MyBeanPostProcessor:postProcessBeforeInitialization(-,-)");
	    return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyBeanPostProcessor:postProcessAfterInitialization(-,-)");
		return bean;
	}

}
