package com.nt.bo;

public class EmployeeBO {
	private String ename;
	private int basicSalary;
	private int grossSalary;
	private int netSalary;
	
	public EmployeeBO() {
		System.out.println("EmployeeBO.0-param cosntructor");
	}
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
	public int getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(int grossSalary) {
		this.grossSalary = grossSalary;
	}
	public int getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(int netSalary) {
		this.netSalary = netSalary;
	}

}
