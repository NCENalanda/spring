package com.nt.target;

public   class IntrestAmountCalculator {//implements IntrestAmountCalculatorInterface{
	
	public  float  calcSimpleIntrAmount(float pAmt,float rate,float time){
		System.out.println("IAC::calcSimpleIntrAmount(-,-,-)");
		 return  pAmt*rate*time/100.0f;
	}
	public  float calcCompoundIntrAmount(float pAmt,float rate, float time){
		System.out.println("IAC::calcCompoundIntrAmount(-,-,-)");
		return  (float) ((pAmt* Math.pow((1+rate/100),time))-pAmt);
	}

}
