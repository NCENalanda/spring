package com.nt.vo;

public class StudentVO {
	private String name;
	private String rank;
	private String id;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", rank=" + rank + ", id=" + id + "]";
	}
	
}
