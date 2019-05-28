package com.nt.bo;

public class EmployeeResultBO extends EmployeeBO {
	private int deptNo;
	private  int mgr;
	
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

}
