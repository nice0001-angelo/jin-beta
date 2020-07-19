package net.jin.utils;

public class Car {
	//Field
	public String company = "Benz";
	public String model;
	public String color;
	public int maxSpeed;
	
	//Costructor
	public Car(){
	}
	
	public Car(String model){
		this(model, "silver",250);
	}
	
	public Car(String model, String color){
		this(model, color, 300);
	}
	
	public Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
