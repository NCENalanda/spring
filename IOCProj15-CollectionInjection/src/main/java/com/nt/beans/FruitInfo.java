package com.nt.beans;

import java.util.Properties;

public class FruitInfo {
	private  Properties  fruitDetails;

	
	public void setFruitDetails(Properties fruitDetails) {
		this.fruitDetails = fruitDetails;
	}


	@Override
	public String toString() {
		return "FruitInfo [fruitDetails=" + fruitDetails + "]";
	}
	
	

}
