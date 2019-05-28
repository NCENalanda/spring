package com.nt.beans;

import java.util.Date;

public class DTDC {
	
	public  String deliver(int orderId){
		return  "DTDC-->"+orderId+" OrderId order is delivered to customer on "+new Date();
	}

}
