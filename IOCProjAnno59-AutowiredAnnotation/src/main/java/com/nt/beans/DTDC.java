package com.nt.beans;

public class DTDC {
	private String location;
	
	public void setLocation(String location) {
		this.location = location;
	}

	public void deliver(int oid){
		System.out.println("DTDC: "+oid+" order is delivered");
	}

	@Override
	public String toString() {
		return "DTDC [location=" + location + "]";
	}

	
	

}
