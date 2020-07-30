package net.jin.vehicle.service.impl;

import net.jin.vehicle.service.Vehicle;

public class Bus implements Vehicle{
	@Override
	public void run() {
		System.out.println("버스가 달립니다");
	}

}
