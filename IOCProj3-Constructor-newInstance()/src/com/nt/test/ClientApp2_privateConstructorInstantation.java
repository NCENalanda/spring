package com.nt.test;

import java.lang.reflect.Constructor;
import java.util.Date;

import com.nt.beans.WishGenerator;
import com.nt.beans.WishGenerator1;

public class ClientApp2_privateConstructorInstantation {

	public static void main(String[] args)throws Exception {
		WishGenerator1 generator=null;
		Constructor cons[]=null;
		
		//load calss
		Class c=Class.forName("com.nt.beans.WishGenerator1");
		//get All Declared constructors
		cons=c.getDeclaredConstructors();
		//get Acesss to private Construtors
		cons[0].setAccessible(true);
		//instantiate the class..
		generator=(WishGenerator1)cons[0].newInstance();
		System.out.println("Invoke method::"+generator.generateWishMessage("Raja"));
	}//main
}//class
