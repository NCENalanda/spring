package com.nt.beans;

public class JersyShirt {
	private String shirtType;
	private String jersyNo;
	private String  shirtSize; 
	public JersyShirt() {
		System.out.println("JersyShirt:0-param constructor");
	}
	public void setShirtType(String shirtType) {
		System.out.println("JersyShirt:setShirtType(-)");
		this.shirtType = shirtType;
	}
	public void setJersyNo(String jersyNo) {
		System.out.println("JersyShirt:setJersyNo(-)");
		this.jersyNo = jersyNo;
	}
	public void setShirtSize(String shirtSize) {
		System.out.println("JersyShirt:setShirtSize(-)");
		this.shirtSize = shirtSize;
	}
	@Override
	public String toString() {
		return "JersyShirt [shirtType=" + shirtType + ", jersyNo=" + jersyNo + ", shirtSize=" + shirtSize + "]";
	}
	
	

}
