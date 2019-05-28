package com.nt.locator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.FactoryBean;

import com.nt.external.ICCScoreComp;
import com.nt.external.ICCScoreCompImpl;

public class ICCScoreCompServiceLocator{
   private static Map<String,ICCScoreComp> cache=new HashMap();

	
	public static ICCScoreComp getService(String jndiName)  {
		ICCScoreComp comp=null;
		if(!cache.containsKey(jndiName)){
     	//Write Lookup Code here ..
		   comp=new ICCScoreCompImpl();
		   cache.put(jndiName, comp);
		}
		return cache.get(jndiName);
	}
}
