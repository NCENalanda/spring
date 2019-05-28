package com.nt.beans;

import java.util.Set;

public class User {
	private Set<Long> phones;

	public User(Set<Long> phones) {
		this.phones = phones;
	}

	@Override
	public String toString() {
		return "User [phones=" + phones + "]->"+phones.getClass();
	}
	
	

}
