package com.nt.bo;

public class StudentBO {
private String name;
private int rank;
private int id;
public StudentBO(String name, int rank, int id) {
	super();
	this.name = name;
	this.rank = rank;
	this.id = id;
}

public StudentBO() {
	// TODO Auto-generated constructor stub
}

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
	return "StudentBO [name=" + name + ", rank=" + rank + ", id=" + id + "]";
}

}
