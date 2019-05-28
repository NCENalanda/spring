package com.nt.command;

public class StudentCommand {
private String name;
private Integer rank;
private Integer id;
//Client side validation
private String valid="no";
@Override
public String toString() {
	return "StudentCommand [name=" + name + ", rank=" + rank + ", id=" + id + "]";
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

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getValid() {
	return valid;
}

public void setValid(String valid) {
	this.valid = valid;
}

}
