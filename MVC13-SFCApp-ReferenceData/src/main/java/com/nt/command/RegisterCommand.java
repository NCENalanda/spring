package com.nt.command;

import java.util.Arrays;

public class RegisterCommand {
	private int sno;
	private String sname;
	private String qlfy;
	private String course[]; 
	private String hobies[];
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getQlfy() {
		return qlfy;
	}
	public void setQlfy(String qlfy) {
		this.qlfy = qlfy;
	}
	public String[] getCourse() {
		return course;
	}
	public void setCourse(String[] course) {
		this.course = course;
	}
	public String[] getHobies() {
		return hobies;
	}
	public void setHobies(String[] hobies) {
		this.hobies = hobies;
	}
	
	@Override
	public String toString() {
		return "RegisterCommand [sno=" + sno + ", sname=" + sname + ", qlfy=" + qlfy + ", course="
				+ Arrays.toString(course) + ", hobies=" + Arrays.toString(hobies) + "]";
	}

	
}
