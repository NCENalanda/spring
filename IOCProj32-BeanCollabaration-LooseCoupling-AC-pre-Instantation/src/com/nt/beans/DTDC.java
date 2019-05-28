package com.nt.beans;

import java.util.Date;

public class DTDC  implements Courier{
	
	public DTDC() {
		System.out.println("DTDC::0-param constructor");
	}
	
	public  String deliver(int orderId){
		return  "DTDC-->"+orderId+" OrderId order is delivered to customer on "+new Date();
	}

}
