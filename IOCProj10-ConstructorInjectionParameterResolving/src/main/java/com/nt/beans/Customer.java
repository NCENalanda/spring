package com.nt.beans;

import java.beans.ConstructorProperties;

public class Customer {
	private int custNo;
	private String custName;
	private float billAmt;
	private String addrs;
	
	@ConstructorProperties(value = { "custId","custName","billAmt","addrs" })
	public Customer(int custId, String custName, float billAmt, String addrs) {
		System.out.println("Customer::4-param constructor");
		this.custNo = custId;
		this.custName = custName;
		this.billAmt = billAmt;
		this.addrs = addrs;
	}

	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", custName=" + custName + ", billAmt=" + billAmt + ", addrs=" + addrs
				+ "]";
	}
	
	

}
