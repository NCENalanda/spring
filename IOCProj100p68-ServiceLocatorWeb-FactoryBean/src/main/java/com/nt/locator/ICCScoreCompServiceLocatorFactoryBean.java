package com.nt.locator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nt.external.ICCScoreComp;
import com.nt.external.ICCScoreCompImpl;

@Component("ICCLocator")
public class ICCScoreCompServiceLocatorFactoryBean implements FactoryBean<ICCScoreComp> {
	@Value("icc")
	private String jndiName;

	private  Map<String,ICCScoreComp> cache=new HashMap();
	

	@Override
	public ICCScoreComp getObject() throws Exception {
		 ICCScoreComp extComp=null;
		//Actually we should write jndi code here to get Extenal comp ref through lookup code
		if(!cache.containsKey(jndiName)){
			extComp=new ICCScoreCompImpl();
			cache.put(jndiName, extComp);
		}
		return cache.get(jndiName);
	}

	@Override
	public Class<?> getObjectType() {
		return ICCScoreComp.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
