package com.nt.command;

import java.sql.Date;

public class FacultyCommand {
	
	private int        id;
	private String   name;
	private String  addrs;
	private String      doj;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "FacultyCommand [id=" + id + ", name=" + name + ", addrs=" + addrs + ", doj=" + doj + "]";
	}
	
	

}
