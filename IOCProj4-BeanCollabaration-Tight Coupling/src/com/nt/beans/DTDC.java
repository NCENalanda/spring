package com.nt.beans;

public class DTDC {
	static{
		System.out.println("DTDC:: static block");
	}
	public DTDC() {
		System.out.println("DTDC:: 0-param constructor");
	}
	
	public void deliver(int oid){
		System.out.println("DTDC:: delevring order whose order id::"+oid);
	}

}
