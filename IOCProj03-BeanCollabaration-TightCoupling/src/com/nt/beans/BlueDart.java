package com.nt.beans;

import java.util.Date;

public class BlueDart {
	
	public BlueDart() {
		System.out.println("BlueDart::0-param constructor");
	}
	
	public  String deliver(int orderId){
		return  "BlueDart-->"+orderId+" OrderId order is delivered to customer on "+new Date();
	}

}
