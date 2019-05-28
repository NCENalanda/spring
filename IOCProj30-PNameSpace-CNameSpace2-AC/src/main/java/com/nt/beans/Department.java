package com.nt.beans;

import java.util.Date;

public class Department {
	private int deptNo;
	
	private String deptName;
	private Date  startDate;
	
	public Department(int deptNo, String deptName, Date startDate) {
		System.out.println("Department:: 3-param constructor");
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", deptName=" + deptName + ", startDate=" + startDate + "]";
	}
	
	
	

}
