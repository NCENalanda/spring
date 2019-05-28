package com.nt.beans;

public class TravelAgent {
	private TourPlan tp;
	public void setName(String name) {
		this.name = name;
	}

	private String name;
	
	public TravelAgent(TourPlan tp) {
		System.out.println("TravelAgent::1-param constructor");
		this.tp = tp;
	}

	public TravelAgent() {
		System.out.println("TravelAgent::0-param constructor");
	}

	public void setTp(TourPlan tp) {
		System.out.println("TravelAgent::setTp(-)");
		this.tp = tp;
	}

	@Override
	public String toString() {
		return "TravelAgent [tp=" + tp + ", name=" + name + "]";
	}



}
