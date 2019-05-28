package com.nt.dto;

import java.io.Serializable;

public class StudentDTO implements Serializable {
	public StudentDTO() {
		// TODO Auto-generated constructor stub
		//System.out.println("  0-param constructor StudentDTO  ");
		//System.out.println(name);
		//System.out.println(rank);
		//System.out.println(id);
	}
	private String name;
	private int rank;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRank() {
		//System.out.println("in setter of rank --------"+rank);
		return rank;
	}
	public void setRank(int rank) {
		//System.out.println("in getter of rank --------"+rank);
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
		return "StudentDTO [name=" + name + ", rank=" + rank + ", id=" + id + "]";
	}
	
}
