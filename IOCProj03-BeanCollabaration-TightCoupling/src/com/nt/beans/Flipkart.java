package com.nt.beans;

import java.util.Random;

public class Flipkart {
	//private DTDC  dtdc;
	private BlueDart blueDart;

	public void setBlueDart(BlueDart blueDart) {
		System.out.println("Flipkart::setBlueDart(-)");
		this.blueDart = blueDart;
	}

	public Flipkart() {
		System.out.println("Flipkart:: 0-param constructor");
	}
	
	/*public void setDtdc(DTDC dtdc) {
		System.out.println("Flipkart::setDtdc(-)");
		this.dtdc = dtdc;
	}*/
	
	public String shopping(String items[]){
		System.out.println("Flipkart:: shopping(-)");
		float billAmt=0.0f;
		int orderId=0;
		String deliverStatus=null;
		//write b.logic
		billAmt=items.length*1000;
		orderId=new Random().nextInt(100000);
		//deliver products
		//deliverStatus=dtdc.deliver(orderId);
		deliverStatus=blueDart.deliver(orderId);
		return orderId+" Order Id Order bill Amount"+billAmt+"--->"+deliverStatus;
	}
}
