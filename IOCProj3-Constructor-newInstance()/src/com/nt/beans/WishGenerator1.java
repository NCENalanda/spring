package com.nt.beans;

import java.util.Date;

//Target class
public class WishGenerator1 {
	static{
		System.out.println("WishGenerator:static block");
	}
	
	
	
	private WishGenerator1(){
		System.out.println("WishGenerator1.0-param constructor()");
	}
	
	
	//B.method having b.logic...
	public String   generateWishMessage(String user){
		System.out.println("WishGenerator::generateWishMessage(-)");
		return "Good morning:"+user;
		}//method
}//class
