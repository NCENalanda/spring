package com.nt.beans;

public class BankIntrAmountCalculator {
	private LoanDetails  details;

	public void setDetails(LoanDetails details) {
		this.details = details;
	}
	
	public float  calcSimpleIntrAmount(){
		 return  (details.getpAmt()*details.getTime()*details.getRate()/100);
	}
}
