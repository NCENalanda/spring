package com.nt.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("container")
public abstract class MyServletContainer {
	public MyServletContainer() {
		System.out.println("MyServletContainer:0-param constructor");
	}
	
	@Lookup
	public abstract RequestHandler getHandler();
	
	public void processRequest(String data){
		RequestHandler rh=null;
		//get RequestHandler object (Depedent class object)
		rh=getHandler();
		//use RequestHandler class obj
		rh.handleRequest(data);
	}

}
