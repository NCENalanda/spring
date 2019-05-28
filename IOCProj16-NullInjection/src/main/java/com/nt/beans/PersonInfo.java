package com.nt.beans;

import java.util.Date;
import java.util.Set;

public class PersonInfo {
	private int pid;
	private String pname;
	private String addrs;
	private Date dob;
	
	public PersonInfo(int pid, String pname, String addrs, Date dob) {
	    System.out.println("PersonInfo:: 4-param constructor");
		this.pid = pid;
		this.pname = pname;
		this.addrs = addrs;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "PersonInfo [pid=" + pid + ", pname=" + pname + ", addrs=" + addrs + ", dob=" + dob + "]";
	}
}
