package net.jin.utils;

public class Car {
	//Field
	String company = "Hyundai";
	String model;
	String color;
	int maxSpeed;
	
	//Costrouctor
	Car(){
		
	}
	
	Car(String model){
		this(model, "silver",250);
	}
	
	Car(String model, String color){
		this(model, color, 300);
	}
	
	Car(String mode, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
