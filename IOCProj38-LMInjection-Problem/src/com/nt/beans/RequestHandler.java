package com.nt.beans;

public class RequestHandler {
	private static int count;
	public RequestHandler() {
		count++;
		System.out.println("RequestHandler:: 0-param constructor");
	}
	
	public  void handleRequest(String data){
		System.out.println("Request Hanndler::handling "+count+" number request with Data -->"+data);
	}

}
