package com.nt.service;

import org.springframework.stereotype.Service;

@Service("arithmetic")
public class ArithmeticOperations {
	
	public int sum(int x,int y){
		return x+y;
	}
	public  int sub(int x,int y){
		return x-y;
	}
	public int mul(int x,int y){
		return x*y;
	}
	public  int div(int x,int y){
		return x/y;
	}
	

}
