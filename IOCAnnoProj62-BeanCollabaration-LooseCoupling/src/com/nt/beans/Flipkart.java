package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("fpkt")
public final class Flipkart {
	@Resource
   private Courier courier;

static{
	   System.out.println("Flipkart::static block");
   }
   
   public Flipkart() {
	System.out.println("Flipkart::0-param constructor");
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
	   if(courier!=null)
	      courier.deliver(orderId);
   }//shopping(-)
  }//class
