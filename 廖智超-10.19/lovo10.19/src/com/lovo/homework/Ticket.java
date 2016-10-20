package com.lovo.homework;

public class Ticket {
	public static long ticketNumber=10000;
	private int koufen;// 扣分
	private double fakuan;// 罚款
	private String reason;// 罚款原因
	private String date;// 罚款日期
	private Driver driver;
	private Car car;
	private Police police;

	public int getKoufen() {
		return koufen;
	}

	public void setKoufen(int koufen) {
		this.koufen = koufen;
	}

	public double getFakuan() {
		return fakuan;
	}

	public void setFakuan(double fakuan) {
		this.fakuan = fakuan;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Police getPolice() {
		return police;
	}

	public void setPolice(Police police) {
		this.police = police;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
