package com.nt.serviceLocator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.FactoryBean;

import com.nt.external.ICCScoreComp;
import com.nt.external.ICCScoreCompImpl;

public class ICCScoreCompServiceLocatorFactoryBean implements FactoryBean<ICCScoreComp> {

	private String jndiName;
	private Map<String,ICCScoreComp> cache=new HashMap();
	
	  public void setJndiName(String jndiName) {
			this.jndiName = jndiName;
		}
      
	@Override
	public ICCScoreComp getObject() throws Exception {
		 ICCScoreComp  extComp;
		if(!cache.containsKey(jndiName)){
			 //actually we need to place jndi lookup , but we are placing
			//logic to create ExtenalService class obj directly..
		     extComp=new ICCScoreCompImpl();	
		     cache.put(jndiName,extComp);
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
