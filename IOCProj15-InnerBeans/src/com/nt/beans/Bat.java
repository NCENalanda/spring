package com.nt.beans;

public class Bat {
	private String make;
	private String type;
	
	public Bat() {
		System.out.println("Bat: 0-param constructor");
	}
	public void setMake(String make) {
		this.make = make;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Bat [make=" + make + ", type=" + type + "]";
	}
	
	
	

}
