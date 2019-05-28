package com.nt.beans;

import java.beans.ConstructorProperties;

public class Customer {
	
	private int cno;
	private String cname;
	private String addrs;
	private float billAmt;
	
	@ConstructorProperties(value = { "cno1","cname","addrs","billAmt" })
	public Customer(int cno1, String cname, String addrs, float billAmt) {
		System.out.println("Customer:4-param constructor");
		this.cno = cno1;
		this.cname = cname;
		this.addrs = addrs;
		this.billAmt = billAmt;
	}
	
	@Override
	public String toString() {
		return "Customer [cno=" + cno + ", cname=" + cname + ", addrs=" + addrs + ", billAmt=" + billAmt + "]";
	}

	

}
