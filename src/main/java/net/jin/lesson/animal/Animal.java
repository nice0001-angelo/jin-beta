package net.jin.lesson.animal;

public abstract class Animal {
	public String kind;
	
//	public Animal(String kind) {
//		this.kind = kind;
//	}

	public void breathe() {
		System.out.println("숨을 쉽니다");
	}
	
	//Abstract method
	public abstract void sound();
}
