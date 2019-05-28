package com.nt.locator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import com.nt.external.ICCScoreComp;
import com.nt.external.ICCScoreCompImpl;

@Component("iccServiceLocator")
public class ICCScoreCompServiceLocator {
	private static Map<String,ICCScoreComp> cache=new HashMap();
	//private  Map<String,ICCScoreComp> cache=new HashMap();
	
	public static ICCScoreComp getService(String jndiName) {
		 ICCScoreComp extComp=null;
		//Actually we should write jndi code here to get Extenal comp ref through lookup code
		if(!cache.containsKey(jndiName)){
			extComp=new ICCScoreCompImpl();
			cache.put(jndiName, extComp);
		}
		return cache.get(jndiName);
	}
	
/*	public  ICCScoreComp getService(String jndiName) {
		 ICCScoreComp extComp=null;
		//Actually we should write jndi code here to get Extenal comp ref through lookup code
		if(!cache.containsKey(jndiName)){
			extComp=new ICCScoreCompImpl();
			cache.put(jndiName, extComp);
		}
		return cache.get(jndiName);
	}*/

}
