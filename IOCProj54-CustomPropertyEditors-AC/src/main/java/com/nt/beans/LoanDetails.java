package com.nt.beans;

public class LoanDetails {
	private float pAmt;
	private float rate;
	private float time;
	
	public LoanDetails(float pAmt, float rate, float time) {
		this.pAmt = pAmt;
		this.rate = rate;
		this.time = time;
	}

	public float getpAmt() {
		return pAmt;
	}

	public float getRate() {
		return rate;
	}


	public float getTime() {
		return time;
	}

}
