package net.jin.vehicle.service.impl;

import net.jin.vehicle.service.Vehicle;

public class Taxi implements Vehicle{
	@Override
	public void run() {
		System.out.println("택시가 달립니다");
	}

}
