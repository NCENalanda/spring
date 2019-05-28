package com.nt.beans;

import java.util.Date;

public class Department {
	private int deptNo;
	private String deptName;
	private String deptLoc;
	private Date dop;

	public Department(int deptNo, String deptName, String deptLoc, Date dop) {
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.deptLoc = deptLoc;
		this.dop = dop;
	}

	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", deptName=" + deptName + ", deptLoc=" + deptLoc + ", dop=" + dop
				+ "]";
	}

}
