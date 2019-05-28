package com.nt.service;

import java.util.ArrayList;
import java.util.List;

public class EvenNo {
	
	public List<Number> genreateEven(){
		//create List obj
		List<Number> al=null;
		
		//intialize List obj
		al=new ArrayList<>();
		for(int i=0;i<10;i++){
			al.add(i);
			i++;
		}
		return al;
	}

}
