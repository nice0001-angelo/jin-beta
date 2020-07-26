package net.jin.lesson;

public class SmartPhone extends Phone {
	//Constructor
	public SmartPhone(String owner) {
		super(owner);
	}

	//Method
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다");
	}
}
