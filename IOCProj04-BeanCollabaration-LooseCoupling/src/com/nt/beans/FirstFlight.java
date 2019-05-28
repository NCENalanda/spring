package com.nt.beans;

import java.util.Date;

public class FirstFlight implements Courier {
	
	public FirstFlight() {
		System.out.println("FirstFlight::0-param constructor");
	}

	@Override
	public String deliver(int orderId) {
		return  "FirstFlight-->"+orderId+" OrderId order is delivered to customer on "+new Date();
	}

}
