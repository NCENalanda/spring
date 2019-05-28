package com.nt.bpp;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.nt.bo.PersonBO;

public class PersonBOPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("PBPP:postProcessBeforeInitiaization(-,-)");
		if(bean instanceof PersonBO){
			((PersonBO)bean).setDoj(new Date());
		}
		return bean;
		
	}
	
	
	
	
}
