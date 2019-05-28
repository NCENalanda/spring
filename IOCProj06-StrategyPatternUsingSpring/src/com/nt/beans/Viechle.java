package com.nt.beans;

public final class Viechle {
	private  Engine engine;

	public Viechle() {
		System.out.println("Viechle:0-param constructor");
	}
	 
	public void setEngine(Engine engine) {
		System.out.println("Viechel::setEngine(-)");
		this.engine = engine;
	}
	
	public void move(){
		engine.start();
		System.out.println("Viechle is moving....");
	}
	
	public void parking(){
		engine.stop();
		System.out.println("Viechle is parked.");
	}

}
