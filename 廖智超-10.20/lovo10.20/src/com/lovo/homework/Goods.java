package com.lovo.homework;

public class Goods {
	private String name;// 商品名
	private double price;// 价格
	private int amounts;// 库存

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAmounts() {
		return amounts;
	}

	public void setAmounts(int amounts) {
		this.amounts = amounts;
	}

	public Goods() {
		super();
	}

	public Goods(String name, double price, int amounts) {
		super();
		this.name = name;
		this.price = price;
		this.amounts = amounts;
	}

}
