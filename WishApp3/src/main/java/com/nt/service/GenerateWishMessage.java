package com.nt.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;
@Service
public class GenerateWishMessage {
	//private Calendar cal;
	public GenerateWishMessage() {
		// TODO Auto-generated constructor stub
		System.out.println("GenerateWishMessage                                                               GenerateWishMessage()");
	}
/*	
public GenerateWishMessage( Calendar cal) {
	this.cal=cal;
}
*/
public String generateWishMessage() {
	String msg= "Good   Morning   ! !! !";
	/*int hour=0;
	hour=cal.HOUR_OF_DAY;
	*/
	return msg ;
}
}
