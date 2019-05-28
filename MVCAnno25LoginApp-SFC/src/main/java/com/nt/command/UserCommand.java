package com.nt.command;
import java.io.Serializable;

public class UserCommand  {
	private String uname;
	private String pwd;
	
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

}
