package com.nt.beans;

import java.util.Date;

public class Passport {
	private long passportNo;
	private String personName;
	private String addrs;
	private Date dob;

	public void setPassportNo(long passportNo) {
		this.passportNo = passportNo;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Passport [passportNo=" + passportNo + ", personName=" + personName + ", addrs=" + addrs + ", dob=" + dob
				+ "]";
	}

	
}
