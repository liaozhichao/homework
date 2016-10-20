package com.lovo.test;

import com.lovo.homework.*;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taxman taxman = new Taxman("张全蛋", "9527");
		Store store = new Store("富士康", "成都市高新产业园区");
		Goods iphone6s = new Goods("IPhone6s", 4500, 1000);
		Goods iphone7 = new Goods("IPhone7", 6000, 1000);
		store.computeSale(iphone6s, 1000);
		store.computeSale(iphone7, 800);
		taxman.computeTax(store, 0.01);
	}
}
