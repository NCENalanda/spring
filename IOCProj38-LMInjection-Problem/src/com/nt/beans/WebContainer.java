package com.nt.beans;

public class WebContainer {
	private RequestHandler handler;
	
	public WebContainer() {
		System.out.println("WebContainer: 0-param constructor");
	}

	public void setHandler(RequestHandler handler) {
		this.handler = handler;
	} 
	
	public  void processRequest(String data){
		System.out.println("webConntainer::Recived request with data -->"+data);
		//use handler
		handler.handleRequest(data);
	}//method
}//class
