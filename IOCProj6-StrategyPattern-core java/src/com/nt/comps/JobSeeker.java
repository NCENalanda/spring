package com.nt.comps;

public final class JobSeeker {
	private Course course;
	
	public void setCourse(Course course){
		this.course=course;
	}
	
	public String  applyJob(String company){
		String status=null;
		status=course.studyCourse();
		return "Applied for JOB with "+status+" and succeded to get Job in "+company;
	}

}
