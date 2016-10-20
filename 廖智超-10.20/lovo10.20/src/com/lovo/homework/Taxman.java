package com.lovo.homework;

public class Taxman {
	private String name;

	private String number;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Taxman() {
		super();
	}

	public Taxman(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}

	// 计算商店应该交的税
	public void computeTax(Store store, double taxRate) {
		System.out.println(store.getName() + "应该交的税是" + store.totalSale * taxRate + "元");
	}

}
