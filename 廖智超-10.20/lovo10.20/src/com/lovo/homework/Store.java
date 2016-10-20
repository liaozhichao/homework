package com.lovo.homework;

public class Store {
	public static double totalSale = 0.0;

	private String name;

	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Store() {
		super();
	}

	public Store(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	// 计算销售额
	public void computeSale(Goods goods, int saleAmount) {
		if (saleAmount > goods.getAmounts())
			System.out.println("库存不足了");
		else {
			this.totalSale += goods.getPrice() * saleAmount;
			System.out.println(this.name + "目前总营业额是" + this.totalSale);
		}

	}
}
