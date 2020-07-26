package net.jin.lesson.animal;

public class Dog extends Animal{
	public Dog() {
		this.kind = "포유류";
	}
	
	//override
	public void sound() {
		System.out.println("멍멍");
	}
}
