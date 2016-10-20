package com.lovo.homework;

public class ElevatorProgram {
	public static void main(String[] args) {
		Elevator elevator1 = new Elevator();
		Elevator elevator2 = new Elevator(16);
		elevator1.goToFloor(15);
		elevator2.goToFloor(15);

	}
}
