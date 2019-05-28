package com.nt.beans;

import org.springframework.stereotype.Component;

@Component
public class DHL  implements Courier{
	
	static{
		System.out.println("DHL:: static block");
	}
	public DHL() {
		System.out.println("DHL:: 0-param constructor");
	}
	
/*	public void deliver(int oid){
		System.out.println("DHL:: delevring order whose order id::"+oid);
	}
*/
}
