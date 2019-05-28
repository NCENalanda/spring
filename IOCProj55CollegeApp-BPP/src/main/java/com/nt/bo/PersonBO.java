package com.nt.bo;

import java.util.Date;

public abstract class PersonBO {
	private int pid;
	private String pname;
	private Date doj;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}

}
