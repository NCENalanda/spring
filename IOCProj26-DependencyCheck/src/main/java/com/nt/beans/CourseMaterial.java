package com.nt.beans;

public class CourseMaterial {
	private String name;
	private  int pagesCount;
	public void setName(String name) {
		this.name = name;
	}
	public void setPagesCount(int pagesCount) {
		this.pagesCount = pagesCount;
	}
	@Override
	public String toString() {
		return "CourseMaterial [name=" + name + ", pagesCount=" + pagesCount + "]";
	}
	
	

}
