package com.nt.beans;


public class Bike {
	 private String bikeNo;
	   private String make;
	   private  String engineCC;
	   private  String color;
	   private  int price;
	   private String model;
	public void setBikeNo(String bikeNo) {
		this.bikeNo = bikeNo;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void setEngineCC(String engineCC) {
		this.engineCC = engineCC;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Bike [bikeNo=" + bikeNo + ", make=" + make + ", engineCC=" + engineCC + ", color=" + color + ", price="
				+ price + ", model=" + model + "]";
	}
	
	
}
