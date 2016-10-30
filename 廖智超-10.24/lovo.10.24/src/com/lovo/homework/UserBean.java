package com.lovo.homework;

public class UserBean {
	private String cardNum;
	private String password;
	private double account;
	
	public UserBean(){
		super();
	}

	public UserBean(String cardNum, String password, double account) {
		super();
		this.cardNum = cardNum;
		this.password = password;
		this.account = account;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getAccount() {
		return account;
	}

	public void setAccount(double account) {
		this.account = account;
	}
	
	
	
	
}
