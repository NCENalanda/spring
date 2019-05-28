package com.nt.model;

public class Student {
	private int sID;
	private String sName;
	private String email;
	public Student() {
		// TODO Auto-generated constructor stub
		System.out.println("0-Pram Constructor ");
	}
	public int getsID() {
		return sID;
	}
	public void setsID(int sID) {
		this.sID = sID;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
