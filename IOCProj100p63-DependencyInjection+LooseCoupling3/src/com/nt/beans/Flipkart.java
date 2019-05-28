package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

import javax.annotation.Resource;
import javax.inject.Named;

@Named("fpkt")
public class Flipkart {
	@Resource(name="dtdc")
	private Courier courier;
	
	public Flipkart() {
		System.out.println("Flipkart:0-param constructor");
	}
	
	public  void  shopping(String items[]){
		float billAmt=0.0f;
		Random rad=null;
		int oid=0;
		//calc bill Amt
		billAmt=items.length*500;
		//generate OrderId
		rad=new Random();
		oid=rad.nextInt(200000);
		System.out.println("OrderId "+oid+" bill Amount is"+billAmt+" items are "+Arrays.toString(items));
		//use Courier service for delivery
		 //dtdc.deliver(oid);
		courier.deliver(oid);
	}//method
}//class
