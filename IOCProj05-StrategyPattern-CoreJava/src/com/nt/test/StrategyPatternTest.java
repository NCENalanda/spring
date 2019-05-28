package com.nt.test;

import com.nt.factory.ViechleFactory;
import com.nt.sp.Viechle;

public class StrategyPatternTest {

	public static void main(String[] args) {
		Viechle viechle=null;
		//get Viechle from ViecheFactory
		//viechle=ViechleFactory.getInstance("petrol");
		viechle=ViechleFactory.getInstance("CNG");
		//invoke methods..
		viechle.move();
		System.out.println("---------------------------------");
		viechle.parking();
	}
}
