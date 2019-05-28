package com.nt.beans;

import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@DependsOn("fpkt")
//@Lazy
public class BlueDart  implements Courier{
	
	static{
		System.out.println("BlueDart:: static block");
	}
	public BlueDart() {
		System.out.println("BlueDart:: 0-param constructor");
	}
	
	public void deliver(int oid){
		System.out.println("BlueDart:: delevring order whose order id::"+oid);
	}

}
