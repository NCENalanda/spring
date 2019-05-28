package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("handler")
public class RequestHandler {
	 private static int count=0;
	public RequestHandler() {
		count++;
	  System.out.println("RequestHandler:0-param construtor-->"+count);
	}

	public void handleRequest(String data){
		System.out.println("handling request with data:::"+data);
	}
}


