package com.nt.target;

public interface IntrestAmountCalculatorInterface {
   public float  calcSimpleIntrAmount(float pAmt,float time,float rate);
   public float  calcCompoundIntrAmount(float pAmt,float time,float rate);
}
