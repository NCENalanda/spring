package com.nt.beans;

import java.util.Arrays;
import java.util.Date;

public class Student {
	private int marks[];
	private Date impDates[];

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public void setImpDates(Date[] impDates) {
		this.impDates = impDates;
	}

	@Override
	public String toString() {
		return "Student [marks=" + Arrays.toString(marks) + ", impDates=" + Arrays.toString(impDates) + "]";
	}

}// class
