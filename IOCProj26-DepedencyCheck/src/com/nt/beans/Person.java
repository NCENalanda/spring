package com.nt.beans;

public class Person {
	private int personId;
	private String personName;
	private MobileNumber mobile;
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public void setMobile(MobileNumber mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", mobile=" + mobile + "]";
	}
	
	

}
