package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC {
	@Autowired
	private Date dd;
	
	@Value("hyd")
	private String location;
	
	public DTDC() {
	 System.out.println("DTDC:0-param constructor");
	}
	


	public void deliver(int oid){
		System.out.println("DTDC: "+oid+" order is delivered on "+dd);
	}

	@Override
	public String toString() {
		return "DTDC [location=" + location + "]";
	}

	
	

}
