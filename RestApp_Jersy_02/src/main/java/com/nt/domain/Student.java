package com.nt.domain;

import org.codehaus.jackson.annotate.JsonProperty;

public class Student {
	
	@JsonProperty("name")
	private String name;
	@JsonProperty("rank")
	private int    rank;
	@JsonProperty("id")
	private int    id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rank=" + rank + ", id=" + id + "]";
	}
	
   
}
