package com.nt.dto;

import java.io.Serializable;

public class StudentDTO implements Serializable {
	private int sno;
	private String sanme;
	private  String course;
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSanme() {
		return sanme;
	}
	public void setSanme(String sanme) {
		this.sanme = sanme;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

}
