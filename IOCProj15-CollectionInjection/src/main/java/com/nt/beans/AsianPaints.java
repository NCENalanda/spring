package com.nt.beans;

import java.util.Arrays;
import java.util.Date;

public class AsianPaints {
	private String colors[];
	private Date  impDates[]; 

	public void setImpDates(Date[] impDates) {
		this.impDates = impDates;
	}

	public void setColors(String[] colors) {
		this.colors = colors;
	}

	@Override
	public String toString() {
		return "AsianPaints [colors=" + Arrays.toString(colors) + ", impDates=" + Arrays.toString(impDates) + "]";
	}

	

	
}
