package com.nt.beans;

import java.util.Properties;

public class FruitStore {
	
	private Properties  fruitInfo;
	
	public void setFruitInfo(Properties fruitInfo) {
		this.fruitInfo = fruitInfo;
	}

	@Override
	public String toString() {
		return "FruitStore [fruitInfo=" + fruitInfo + "]";
	}
	
	

	

}
