package com.nt.beans;

import javax.inject.Named;

import org.springframework.context.annotation.Scope;

@Named("rh")
@Scope("prototype")
public class RequestHandler {
	private static int count=0;
	public RequestHandler() {
		count++;
		System.out.println("RequestHandler:: 0-param constructor");
	}
	
	public  void handleRequest(String data){
		System.out.println("Request Hanndler::handling "+count+" number request with Data -->"+data);
	}

}
