package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
   private BlueDart blueDart;
   
 

static{
	   System.out.println("Flipkart::static block");
   }
   
   public Flipkart() {
	System.out.println("Flipkart::0-param constructor");
   }
   
   public Flipkart(BlueDart blueDart) {
		System.out.println("Flipkart::1-param constructor");
		this.blueDart=blueDart;
	   }
	   
   
   
   public void setBlueDart(BlueDart bDart) {
	   System.out.println("FlipKart:setBlueDart(-)");
		this.blueDart=bDart;
	}
   
   public   void shooping(String items[]){
	   float billAmt=0.0f;
	   int orderId=0;
	   //calc billAmount
	   billAmt=items.length*500;
	   System.out.println(Arrays.toString(items)+" bill Amount is::"+billAmt);
	   //generate order id
	   orderId=new Random().nextInt(5000);
	   //deliver products using Courier
	   blueDart.deliver(orderId);
   }//shopping(-)
  }//class
