package com.nt.service;

public class ArithmeticOperations implements ArithmeticOpeationsInterface{
	
	public  int  add(int x,int y){
		System.out.println("ArithmeticOperations.add(-,-)");
		return x+y;
	}
	
	public  int  sub(int x,int y){
		System.out.println("ArithmeticOperations.sub(-,-)");
		return x-y;
	}
	
	public  int  mul(int x,int y){
		System.out.println("ArithmeticOperations.mul(-,-)");
		return x*y;
	}
	
	public  int div(int x,int y){
		System.out.println("ArithmeticOperations.div(-,-)");
		return x/y;
	}
}//class
