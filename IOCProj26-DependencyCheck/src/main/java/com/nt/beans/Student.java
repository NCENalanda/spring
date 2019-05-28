package com.nt.beans;

public class Student {
	private int sno;
	private String  sname;
	private CourseMaterial material;
	public void setSno(int sno) {
		this.sno = sno;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setMaterial(CourseMaterial material) {
		this.material = material;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", material=" + material + "]";
	}
	
	

}
