package com.nt.beans;

public final class FirstFlight  implements Courier{
	
	static{
		System.out.println("FirstFlight:: static block");
	}
	public FirstFlight() {
		System.out.println("FirstFlight:: 0-param constructor");
	}
	
	public void deliver(int oid){
		System.out.println("FirstFlight:: delevring order whose order id::"+oid);
	}

}
