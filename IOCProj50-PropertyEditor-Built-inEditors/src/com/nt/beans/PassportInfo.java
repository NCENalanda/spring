package com.nt.beans;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class PassportInfo {
	private int passportNo;
	private String country;
	private String holderName;
	private byte age;
	private File  photoPath;
	private Date dob;
	private long mobileNumber;
	private boolean maritalStatus;
	private char   gender;
	private String[] verifiers;
	private URL  fbUrl;
	private Class currentClass;
	private Locale currentLocale;
	public void setPassportNo(int passportNo) {
		this.passportNo = passportNo;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public void setPhotoPath(File photoPath) {
		this.photoPath = photoPath;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public void setMaritalStatus(boolean maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setVerifiers(String[] verifiers) {
		this.verifiers = verifiers;
	}
	public void setFbUrl(URL fbUrl) {
		this.fbUrl = fbUrl;
	}
	public void setCurrentClass(Class currentClass) {
		this.currentClass = currentClass;
	}
	public void setCurrentLocale(Locale currentLocale) {
		this.currentLocale = currentLocale;
	}
	
	@Override
	public String toString() {
		return "PassportInfo [passportNo=" + passportNo + ", country=" + country + ", holderName=" + holderName
				+ ", age=" + age + ", photoPath=" + photoPath + ", dob=" + dob + ", mobileNumber=" + mobileNumber
				+ ", maritalStatus=" + maritalStatus + ", gender=" + gender + ", verifies=" + Arrays.toString(verifiers)
				+ ", fbUrl=" + fbUrl + ", currentClass=" + currentClass + ", currentLocale=" + currentLocale + "]";
	}

}
