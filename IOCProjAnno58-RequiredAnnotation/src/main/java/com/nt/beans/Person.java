package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Required;

public class Person {
	private int pid;
	private String pname;
	private String addrs;
	private Date dob;
	
   @Required
	public void setPid(int pid) {
		this.pid = pid;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	@Required
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", addrs=" + addrs + ", dob=" + dob + "]";
	}

}
