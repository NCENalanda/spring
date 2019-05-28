package com.nt.beans;

public final class   TestingToolsCourse implements Course {
	
	public TestingToolsCourse() {
		System.out.println("TestingToolsCourse.0-param consturctor");
	}

	@Override
	public String studyCourse() {
		return "TestingTools Learning process is nice only for Non-Talented People-->Course completed";
	}

}
