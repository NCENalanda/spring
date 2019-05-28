package com.nt.beans;

public final class JavaCourse implements Course {
	
	public JavaCourse() {
		System.out.println("JavaCourse::0-param constructor");
	}

	@Override
	public String studyCourse() {
		return "Java Learning process is beatiful.. and Completed";
	}

}
