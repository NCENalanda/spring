package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

@Named("fpkt")
public class Flipkart {
	/*@Inject
	@Named("dtdc")*/
	@Resource(name="dtdc")
 private Courier courier;
	
	public  void  shopping(String items[]) {
		float bill=0.0f;
		bill=items.length*600;
		courier.deliver(new Random().nextInt(10000));
		System.out.println("Shopping for "+Arrays.toString(items)+" is done and Bill Amount:: "+bill);
	}
	
	
}
