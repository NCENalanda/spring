package com.nt.service;

public interface IntrestAmountCalculatorInterface {
	public  float  calcSimpleIntrAmount(float pAmt,float rate,float time);
	public  float  calcCompoundIntrAmount(float pAmt,float rate,float time);
}
