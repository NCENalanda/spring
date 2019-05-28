package com.nt.dto;

import java.io.Serializable;
import java.util.Date;

public class MedicineDetailsDTO implements Serializable {
	private int mid;
	private String medName;
	private int price;
	private Date mfgDate;
	private Date expiryDate;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMedName() {
		return medName;
	}
	public void setMedName(String medName) {
		this.medName = medName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getMfgDate() {
		return mfgDate;
	}
	public void setMfgDate(Date mfgDate) {
		this.mfgDate = mfgDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

}
