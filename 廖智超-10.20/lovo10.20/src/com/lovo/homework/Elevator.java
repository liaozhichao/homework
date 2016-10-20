package com.lovo.homework;

public class Elevator {
	private int currentFloor;

	private int destinationFloor;

	private boolean up;

	private boolean doorsOpen;

	public int getCurrentFloor() {
		return currentFloor;
	}

	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}

	public int getDestinationFloor() {
		return destinationFloor;
	}

	public void setDestinationFloor(int destinationFloor) {
		this.destinationFloor = destinationFloor;
	}

	public boolean getUp() {
		return up;
	}

	public void setUp(boolean up) {
		this.up = up;
	}

	public boolean getDoorsOpen() {
		return doorsOpen;
	}

	public void setDoorsOpen(boolean doorsOpen) {
		this.doorsOpen = doorsOpen;
	}

	public Elevator() {
		this(1);
		System.out.println("当前在无参数的构造器中");
	}

	public Elevator(int currentFloor) {
		this.currentFloor = currentFloor;
		System.out.println("当前在有一个参数的构造器中");
	}

	public void openDoors() {
		this.doorsOpen = true;
		System.out.println("正在开门...");
	}

	public void closeDoors() {
		this.doorsOpen = false;
		System.out.println("正在关门...");
	}

	public void goToFloor(int floors) {
		System.out.println("要去的楼层是" + floors);
		this.destinationFloor = floors;
		if (this.destinationFloor > this.currentFloor) {
			this.up = true;
			goingUp();
		} else {
			this.up = false;
			goingDown();
		}
	}

	public void goingUp() {
		System.out.println("电梯正在上升");
	}

	public void goingDown() {
		System.out.println("电梯正在下降");
	}

}
