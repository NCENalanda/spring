package com.nt.beans;

import java.util.Date;

public class AadharCard {
	private long uid;
	private String pname;
	private  String addrs;
	private Date dob;
	
	public AadharCard(long uid, String pname, String addrs, Date dob) {
		System.out.println("AadharCard:4-param constructor");
		this.uid = uid;
		this.pname = pname;
		this.addrs = addrs;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "AadharCard [uid=" + uid + ", pname=" + pname + ", addrs=" + addrs + ", dob=" + dob + "]";
	}
	
}
