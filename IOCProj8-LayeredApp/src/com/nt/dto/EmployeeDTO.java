package com.nt.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable {
	private int eno;
	private String ename;
	private String addrs;
	private  String company;
	private  int  basicSalary;
	
	public EmployeeDTO() {
		System.out.println("EmployeeDTO.0-param constructor");
	}
	
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	

}
