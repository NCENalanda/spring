package com.nt.command;

import java.io.Serializable;

public class StudentCommand implements Serializable {
	private int sno;
	private String sname;
	private String sadd="hyd";
	private String course="java";
	private Integer age;
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public StudentCommand() {
		System.out.println("StudentCommand:: 0-param consturctor");
	}
	
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
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

}
