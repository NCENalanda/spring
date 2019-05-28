package com.nt.beans;

public class Employee {
	private int eno;
	private String ename;
	private Department dept;

	
	public void setEno(int eno) {
		this.eno = eno;
	}

	
	public void setEname(String ename) {
		this.ename = ename;
	}

	
	public void setDept(Department dept) {
		this.dept = dept;
	}


	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", dept=" + dept + "]";
	}
	
	

}
