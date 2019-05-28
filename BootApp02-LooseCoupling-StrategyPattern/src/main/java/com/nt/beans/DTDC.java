package com.nt.beans;

import javax.inject.Named;

@Named("dtdc")
public final class DTDC implements Courier {

	@Override
	public void deliver(int oid) {
		System.out.println("(DTDC)Delivering Order of order id:::"+oid);

	}

}
