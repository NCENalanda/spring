package com.nt.command;

public class StudentCommand {
private String name;
private Integer rank;
private int id;

public StudentCommand() {
	// TODO Auto-generated constructor stub
	System.out.println("  0-param constructor  ");
	System.out.println(name);
	System.out.println(rank);
	System.out.println(id);
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getRank() {
	return rank;
}
public void setRank(Integer rank) {
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
	return "StudentCommand [name=" + name + ", rank=" + rank + ", id=" + id + "]  /n";
}



}
