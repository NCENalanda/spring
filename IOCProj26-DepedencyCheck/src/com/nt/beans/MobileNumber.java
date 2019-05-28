package com.nt.beans;

public class MobileNumber {
	private long mobileNo;
	private String provider;
	private String payType;
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	@Override
	public String toString() {
		return "MobileNumber [mobileNo=" + mobileNo + ", provider=" + provider + ", payType=" + payType + "]";
	}
	
	 

}
