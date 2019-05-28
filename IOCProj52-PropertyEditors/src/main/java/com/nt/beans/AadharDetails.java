package com.nt.beans;

import java.io.File;
import java.net.URL;
import java.util.Arrays;
import java.util.Date;



public class AadharDetails {
	private String name;
	private long uid;
	private char gender;
	private Date   dob;
	private float  age;
	private File  photoPath;
	private String[] verifiers;
	private  boolean isSingle;
	private URL  googleURL;
	
	public void setGoogleURL(URL googleURL) {
		this.googleURL = googleURL;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public void setPhotoPath(File photoPath) {
		this.photoPath = photoPath;
	}
	public void setVerifiers(String[] verifiers) {
		this.verifiers = verifiers;
	}
	public void setIsSingle(boolean isSingle) {
		this.isSingle = isSingle;
	}
	@Override
	public String toString() {
		return "AadharDetails [name=" + name + ", uid=" + uid + ", gender=" + gender + ", dob=" + dob + ", age=" + age
				+ ", photoPath=" + photoPath + ", verifiers=" + Arrays.toString(verifiers) + ", isSingle=" + isSingle
				+ ",googleURL="+googleURL+"]";
	}
	

}
