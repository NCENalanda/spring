package com.nt.service;

public class BillAmountCalculator {

	public  float calcBillAmount(float price,float qty){ 
		System.out.println("BAC::calcBillAmount(-,-)");
		if(price==0.0f || qty==0.0f)
			throw new IllegalArgumentException("Invalid inputs....");
		return  price*qty;
	}
}
