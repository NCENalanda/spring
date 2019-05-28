package com.nt.test;

import java.lang.reflect.Constructor;
import java.util.Date;

import com.nt.beans.WishGenerator;

public class ClientApp {

	public static void main(String[] args)throws Exception {
		//load and instantiate java.util.Date class
		Date dt=(Date)Class.forName("java.util.Date").newInstance();
		//Load WishGenerator class
		Class c=Class.forName("com.nt.beans.WishGenerator");
		//get All Cosntructors
		Constructor cons[]=c.getDeclaredConstructors();
		//use 1-param constructor for instantiation
		WishGenerator wish=(WishGenerator) cons[0].newInstance(dt);
		//invoke b.method
		System.out.println(wish.generateWishMessage("sita"));
		
	}

}
