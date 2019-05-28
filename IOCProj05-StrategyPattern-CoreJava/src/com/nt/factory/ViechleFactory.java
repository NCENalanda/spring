package com.nt.factory;

import com.nt.sp.CNGEngine;
import com.nt.sp.DieselEngine;
import com.nt.sp.Engine;
import com.nt.sp.PetrolEngine;
import com.nt.sp.Viechle;

public class ViechleFactory {
	
	public static  Viechle  getInstance(String engineType){
		Engine engine=null;
		Viechle viechle=null;
		 if(engineType.equalsIgnoreCase("diesel")){
			 engine=new DieselEngine();
			 viechle=new Viechle();
			 viechle.setEngine(engine);
		 }
		 else if(engineType.equalsIgnoreCase("petrol")){
			 engine=new PetrolEngine();
			 viechle=new Viechle();
			 viechle.setEngine(engine);
		 }
		 else if(engineType.equalsIgnoreCase("CNG")){
			 engine=new CNGEngine();
			 viechle=new Viechle();
			 viechle.setEngine(engine);
		 }
		 else{
			 throw  new IllegalArgumentException("we do not support such engines as of now");
		 }
	    return viechle;
	}//method
}//class
