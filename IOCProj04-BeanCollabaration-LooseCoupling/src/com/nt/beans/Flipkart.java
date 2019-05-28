package com.nt.beans;

import java.util.Random;

public class Flipkart {
	private static Courier courier;

	public static void  setCourier(Courier courier1) {
		System.out.println("Flipkart::setCourier(-)");
		courier = courier1;
	}

	private Flipkart() {
		System.out.println("Flipkart:: 0-param constructor");
	}
	
	public String shopping(String items[]){
		System.out.println("Flipkart:: shopping(-)");
		float billAmt=0.0f;
		int orderId=0;
		String deliverStatus=null;
		//write b.logic
		billAmt=items.length*1000;
		orderId=new Random().nextInt(100000);
		//deliver products
		deliverStatus=courier.deliver(orderId);
		return orderId+" Order Id Order bill Amount"+billAmt+"--->"+deliverStatus;
	}
}
