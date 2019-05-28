package com.nt.command;
import java.util.Arrays;
import java.util.Date;

import javax.validation.constraints.NotEmpty;


public class UserCommand  {
	@NotEmpty(message="username is required")
	private String uname;
	@NotEmpty(message="password is required")
	private String pwd;
	private String domain;
	private String courses[];
	private Date dob;
	
	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public UserCommand() {
		System.out.println("UserCommand:0-param constructor");
	}
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "UserCommand [uname=" + uname + ", pwd=" + pwd + ", domain=" + domain + ", courses="
				+ Arrays.toString(courses) + ", dob=" + dob + "]";
	}
	
	

}
