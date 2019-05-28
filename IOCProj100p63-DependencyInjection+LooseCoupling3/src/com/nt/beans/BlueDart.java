package com.nt.beans;

import javax.inject.Named;

import org.springframework.context.annotation.Lazy;

@Named("blueDart")
@Lazy(value=true)
public class BlueDart implements Courier {
	
	public BlueDart() {
		System.out.println("BlueDart:0-param constructor");
	}
	
	public void deliver(int orderId){
	    System.out.println(orderId+" order delivered:BlueDart");
	}
	

}
