package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Flipkart {
	//@Autowired
	private DTDC dtdc;

	/*@Autowired(required=false)
	public  Flipkart(DTDC dtdc){
		System.out.println("Flipkart:: 1-param constructor");
		this.dtdc=dtdc;
	}
	
	@Autowired
	public  Flipkart(DTDC dtdc,int x){
		System.out.println("Flipkart:: 1-param constructor");
		this.dtdc=dtdc;
	}*/
	
	@Autowired
	@Qualifier(value="dtdc2")
	public void setDtdc( DTDC dtdc){
		System.out.println("Flipkart::setDtdc(-)");
		this.dtdc=dtdc;
	}
	
	/*@Autowired
	public  void assign(DTDC dtdc){
		System.out.println("Flipkart::assign(-)");
		this.dtdc=dtdc;
	}*/
	
	
	public  void shopping(String items[]){
		System.out.println(Arrays.toString(items)+" are shopped");
		 dtdc.deliver(new Random().nextInt(1000));
	}

	@Override
	public String toString() {
		return "Flipkart [dtdc=" + dtdc + "]";
	}
	

}
