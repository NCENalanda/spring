package com.nt.beans;

public class WebContainer {
	private RequestHandler handler;
	
	public WebContainer() {
		System.out.println("WebContainer :: 0-param constructor");
	}

	public void setHandler(RequestHandler handler) {
		this.handler = handler;
	}
	
	public void  delegateRequest(String data){
		System.out.println("WebContianer: request recived with "+data+" adn delegating to handler");
		handler.proessingRequest(data);
	}
}//class
