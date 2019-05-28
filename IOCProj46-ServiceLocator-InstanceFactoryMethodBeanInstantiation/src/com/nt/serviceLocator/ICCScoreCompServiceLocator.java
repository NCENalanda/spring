package com.nt.serviceLocator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.FactoryBean;

import com.nt.external.ICCScoreComp;
import com.nt.external.ICCScoreCompImpl;

public class ICCScoreCompServiceLocator{
	private  Map<String,ICCScoreComp> cache=new HashMap();
	
	 
	
	public ICCScoreComp getExtServiceInstance(String jndiName){
		 ICCScoreComp  extComp;
		if(!cache.containsKey(jndiName)){
			 //actually we need to place jndi lookup , but we are placing
			//logic to create ExtenalService class obj directly..
		     extComp=new ICCScoreCompImpl();	
		     cache.put(jndiName,extComp);
		}
		return cache.get(jndiName);			
	}//method

}//class
