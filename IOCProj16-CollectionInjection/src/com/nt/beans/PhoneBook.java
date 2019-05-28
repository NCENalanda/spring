package com.nt.beans;

import java.util.Date;
import java.util.Set;

public class PhoneBook {
	private Set<Long> phones;
	private Set<Date> impDates;

	public void setPhones(Set<Long> phones) {
		this.phones = phones;
	}
	public void setImpDates(Set<Date> impDates) {
		this.impDates = impDates;
	}
	@Override
	public String toString() {
		System.out.println(phones.getClass()+"   "+impDates.getClass());
		return "PhoneBook [phones=" + phones + ", impDates=" + impDates + "]";
	}
	
	


}
