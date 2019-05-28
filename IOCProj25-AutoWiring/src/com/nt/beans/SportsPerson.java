package com.nt.beans;

public class SportsPerson {
	private String name;
	private String sportType;
	private JersyShirt  jersy;
	
	public SportsPerson(JersyShirt jersy) {
		System.out.println("SportsPerson:1-param constructor");
		this.jersy = jersy;
	}
	
	public SportsPerson(String name, String sportType, JersyShirt jersy) {
		System.out.println("SportsPerson:3-param constructor");
		this.name = name;
		this.sportType = sportType;
		this.jersy = jersy;
	}




	public SportsPerson() {
		System.out.println("SprotsPerson::0-param constructor");
	}
	
	
	
	public void setName(String name) {
		System.out.println("SpotsPerson:setName(-)");
		this.name = name;
	}
	public void setSportType(String sportType) {
		System.out.println("SpotsPerson:setSportType(-)");
		this.sportType = sportType;
	}
	public void setJersy(JersyShirt jersy) {
		System.out.println("SpotsPerson:setJersy(-)");
		this.jersy = jersy;
	}

	@Override
	public String toString() {
		return "SportsPerson [name=" + name + ", sportType=" + sportType + ", jersy=" + jersy + "]";
	}
	
	

}
