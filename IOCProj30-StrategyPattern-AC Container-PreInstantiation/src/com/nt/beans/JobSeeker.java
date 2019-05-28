package com.nt.beans;

public final class JobSeeker {
	private Course course;
	
	public JobSeeker() {
		System.out.println("JobSeekeer:0-param constructor");
	}
	
	public void setCourse(Course course){
		System.out.println("JobSeeker:setCourse()");
		this.course=course;
	}
	
	public String  applyJob(String company){
		String status=null;
		status=course.studyCourse();
		return "Applied for JOB with "+status+" and succeded to get Job in "+company;
	}

}
