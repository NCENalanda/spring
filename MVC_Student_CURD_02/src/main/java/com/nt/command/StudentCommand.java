package com.nt.command;

import java.util.Arrays;

public class StudentCommand {
private String name;
private Integer rank;
private Integer id;
private  String country;
private  String state;
private  String District;
private String course[];
private  String hobbies[];


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
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getDistrict() {
	return District;
}
public void setDistrict(String district) {
	District = district;
}
public String[] getCourse() {
	return course;
}
public void setCourse(String[] course) {
	this.course = course;
}
public String[] getHobbies() {
	return hobbies;
}
public void setHobbies(String[] hobbies) {
	this.hobbies = hobbies;
}
@Override
public String toString() {
	return "StudentCommand [name=" + name + ", rank=" + rank + ", id=" + id + ", country=" + country + ", state="
			+ state + ", District=" + District + ", course=" + Arrays.toString(course) + ", hobbies="
			+ Arrays.toString(hobbies) + "]";
}

}
