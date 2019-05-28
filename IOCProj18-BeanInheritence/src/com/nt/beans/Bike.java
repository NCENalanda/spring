package com.nt.beans;

public class Bike {
	   private String bikeId;
	   private  String make;
	   private  String model;
	    private  String engineCC;
	    private  String color;
	    private  int price;
	   private String ownerName;
	   
	   public Bike() {
		System.out.println("Bike:0-param constructor");
	}

	public void setBikeId(String bikeId) {
		this.bikeId = bikeId;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
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

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		return "Bike [bikeId=" + bikeId + ", make=" + make + ", model=" + model + ", engineCC=" + engineCC + ", color="
				+ color + ", price=" + price + ", ownerName=" + ownerName + "]";
	}
}
