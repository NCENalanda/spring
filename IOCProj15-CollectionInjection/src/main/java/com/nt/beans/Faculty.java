package com.nt.beans;

import java.util.Date;
import java.util.Map;

public class Faculty {

	private Map<String, String> facultySubjects;
	private Map<String,?>  batchDates;
 
	public void setFacultySubjects(Map<String, String> facultySubjects) {
		this.facultySubjects = facultySubjects;
	}

	public void setBatchDates(Map<String, ?> batchDates) {
		this.batchDates = batchDates;
	}

	@Override
	public String toString() {
		return "Faculty [facultySubjects=" + facultySubjects + ", batchDates=" + batchDates + "]";
	}


	

}
