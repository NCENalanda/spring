package com.nt.service;

public class OnlineStore {

	public float shopping(String items[]){
		System.out.println("OnlineStore:: shopping(-)");
		float billAmt=0.0f;
		billAmt=items.length*6000.0f;
		return billAmt;
	}
}
