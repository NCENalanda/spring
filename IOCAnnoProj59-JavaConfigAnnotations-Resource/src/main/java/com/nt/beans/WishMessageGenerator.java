package com.nt.beans;

import java.util.Date;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;




@Named("wmg")
@Scope("prototype")
public class WishMessageGenerator {
	//@Resource(name="dt2")
	//private Date date;
	@Resource
	private Date dt1;
	private String name="raja";
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:0-param constructor");
	}
	
	/*@Resource
	public void setDate(Date dt2){
		this.date=dt2;
	}*/
	
	/*@Resource
	public  void assign(Date dt1){
		this.date=dt1;
	}
	*/
	
	
	public String generateWishMessage(){
		//System.out.println("date::"+date);
		System.out.println("date::"+dt1);
		return "Good Morning::"+name;
	}

}
