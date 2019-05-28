package com.nt.beans;

import java.util.Date;
import java.util.List;

public class CountryClub {
	private List<String> names;
	private List<Date> impDates;
	public List<String> getNames() {
		return names;
	}
	public void setNames(List<String> names) {
		this.names = names;
	}
	public List<Date> getImpDates() {
		return impDates;
	}
	public void setImpDates(List<Date> impDates) {
		this.impDates = impDates;
	}
	@Override
	public String toString() {
		System.out.println(names.getClass()+" .."+impDates.getClass());
		return "CountryClub [names=" + names + ", impDates=" + impDates + "]";
	}
	
	

}
