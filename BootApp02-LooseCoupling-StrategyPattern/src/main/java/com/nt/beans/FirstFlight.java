package com.nt.beans;

import javax.inject.Named;

@Named("ff")
public final class FirstFlight implements Courier {

	@Override
	public void deliver(int oid) {
		System.out.println("(FirstFlight) Delivering Order of order id:::"+oid);

	}

}
