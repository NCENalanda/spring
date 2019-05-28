package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component(value="wmg")
@Component("wmg")
public class WishMessageGenerator {
	@Autowired(required=true)
	private Date date;
	@Value("raja")
	private String name;
	
	
	public String generateWishMessage(){
		System.out.println("date::"+date);
		return "Good Morning::"+name;
	}

}
