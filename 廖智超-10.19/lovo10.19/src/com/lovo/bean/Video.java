package com.lovo.bean;

import java.util.Date;

public class Video {
	private String storeNum;// 库存号

	private String filmName;// 影片名字
	
	private boolean lendOrNot;// 是否被出租

	private Customer customer;// 租借人

	private String returnDate;// 归还时间

	public String getStoreNum() {
		return storeNum;
	}

	public void setStoreNum(String storeNum) {
		this.storeNum = storeNum;
	}

	public String getFilmName() {
		return filmName;
	}

	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}

	public boolean getLendOrNot() {
		return lendOrNot;
	}

	public void setLendOrNot(boolean lendOrNot) {
		this.lendOrNot = lendOrNot;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

}
