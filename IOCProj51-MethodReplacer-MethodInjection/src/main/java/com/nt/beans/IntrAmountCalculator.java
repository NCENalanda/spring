package com.nt.beans;

public  class IntrAmountCalculator {
	public static  float  calcSimpleIntrAmount(float pAmt,float time){
		System.out.println("IntrAmountCalculator::calcSimpleIntrAmount(-,-)");
        return (pAmt*2*time)/100.0f;
     }

	//public abstract  float  calcSimpleIntrAmount(float pAmt,float time);
}
