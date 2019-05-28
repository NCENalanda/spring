package com.nt.beans;

public class BatsMan {
	private  Bat bat;

	public BatsMan(Bat bat) {
		System.out.println("BatsMan.1-param constructor");
		this.bat = bat;
	}
	
	public String  hitRuns(){
		return "Scoring runs heavily using the bat :::"+bat;
	}
	

}
