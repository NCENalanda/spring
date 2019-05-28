package com.nt.beans;

import org.springframework.stereotype.Component;

@Component
public final class FirstFlight  implements Courier{
	
	static{
		System.out.println("DHL:: static block");
	}
	public FirstFlight() {
		System.out.println("DHL:: 0-param constructor");
	}
	
	public void deliver(int oid){
		System.out.println("FirstFlight:: delevring order whose order id::"+oid);
	}

}
