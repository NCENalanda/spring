package com.nt.beans;

public class A {
	private B b;

	public A() {
		System.out.println("A:0-param constructor");
	}
	/*public A(B b) {
		this.b = b;
	}*/

	public void setB(B b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "A [b=" + b + "]";
	}
	
}
