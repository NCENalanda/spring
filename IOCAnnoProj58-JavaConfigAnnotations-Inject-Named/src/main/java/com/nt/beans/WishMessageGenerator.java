package com.nt.beans;

import java.util.Date;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//@Component("wmg")
@Named("wmg")
public class WishMessageGenerator {
	//@Inject
	//@Qualifier("dt1")
	//@Named("dt1")
	private Date date;
	//@Value("raja")
	private String name="raja";
	
	/*@Inject
	@Named("dt1")
	public void setDate(Date date){
		this.date=date;
	}
	*/
	
	@Inject
	//@Named("dt1")
	public WishMessageGenerator(@Named("dt1") Date date){
		this.date=date;
	}
	
	
	/*@Inject
	@Named("dt1")
	public  void assign(Date date){
		this.date=date;
	}*/
	
	
	public String generateWishMessage(){
		System.out.println("date::"+date);
		return "Good Morning::"+name;
	}

}
