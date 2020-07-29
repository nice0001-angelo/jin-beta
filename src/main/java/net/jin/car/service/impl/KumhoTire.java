package net.jin.car.service.impl;

import net.jin.car.service.Tire;

public class KumhoTire implements Tire{
	@Override
	public void roll() {
		System.out.println("금호타이어가 굴러갑니다.");
	}

}
