package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component(value="fpkt")
@Component("fpkt")
@Scope(value="singleton")
//@Lazy(value=true)
public class Flipkart {
	
	private DTDC dtdc;

	 public Flipkart() {
		System.out.println("Flipkart: 0-param constuctor");
	}
	
	@Autowired
	public void setDtdc(DTDC dtdc) {
		System.out.println("Flipkart:setDtdc(-)");
		this.dtdc = dtdc;
	}

	public  void shopping(String items[]){
		System.out.println(Arrays.toString(items)+" are shopped");
		 dtdc.deliver(new Random().nextInt(1000));
	}

	@Override
	public String toString() {
		return "Flipkart [dtdc=" + dtdc + "]";
	}
	

}
