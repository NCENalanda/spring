package com.nt.beans;

public final class DotNetCourse implements Course {
	
	public DotNetCourse() {
		System.out.println("DotNetCourse.0-param constructor");
	}

	@Override
	public String studyCourse() {
		return ".net Learning process is beatiful.. and Completed";
	}

}
