package com.nt.beans;

public class IntrestAmountCalculator {
	private AmountDetails details;

	public void setDetails(AmountDetails details) {
		this.details = details;
	}
	
	public float calcIntrestAmount(){
		return (details.getPamt()*details.getTime()*details.getRate())/100.0f;
	}
}
