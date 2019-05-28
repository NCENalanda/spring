package com.nt.vo;

public class EmployeeVO {
	private String eno;
	private String ename;
	private String address;
	private String company;
	private String basicSalary;
	
	public EmployeeVO() {
		System.out.println("EmployeeVO:0-param constructor");
	}
	
	public String getEno() {
		return eno;
	}
	public void setEno(String eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(String basicSalary) {
		this.basicSalary = basicSalary;
	}

}
