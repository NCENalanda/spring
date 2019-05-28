package com.nt.service;

import java.util.Random;

public class ATMPinGenerator {
	
	public  int   generatePin(){
		Random rad=null;
		
		rad=new Random();
		return rad.nextInt(1000);
	}

}
