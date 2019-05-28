package com.nt.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public final class DTDC implements Courier {
	static{
		System.out.println("DTDC:: static block");
	}
	public DTDC() {
		System.out.println("DTDC:: 0-param constructor");
	}
	
public void supply(int oid){
		System.out.println("DTDC:: delevring order whose order id::"+oid);
	}

}
