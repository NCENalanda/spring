package com.nt.beans;

import java.util.List;

public class ClassRoom {
	
	private List<String> names;
	
	 public void setNames(List<String> names) {
			this.names = names;
		}

	@Override
	public String toString() {
		return "ClassRoom [names=" + names + "]-->"+names.getClass();
	}

	 

}
