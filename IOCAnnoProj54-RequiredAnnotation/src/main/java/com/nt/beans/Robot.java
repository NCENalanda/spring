package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Required;

public class Robot {
	private int id;
	private String name;
	private Date dor;
	
	@Required
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Required
	public void setDor(Date dor) {
		this.dor = dor;
	}
	@Override
	public String toString() {
		return "Robot [id=" + id + ", name=" + name + ", dor=" + dor + "]";
	}
}
