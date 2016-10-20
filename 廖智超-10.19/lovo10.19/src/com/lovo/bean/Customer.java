package com.lovo.bean;

import java.util.Scanner;

public class Customer {
	
	private int id;//会员号
	
	private String name;//名字
	
	private boolean vipOrNot;//是否是vip

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVipOrNot() {
		return vipOrNot;
	}

	public void setVipOrNot(boolean vipOrNot) {
		this.vipOrNot = vipOrNot;
	}
	
	//
	public void rent(Video video){
		Scanner scanner = new Scanner(System.in);
		System.out.println("是否确定租借<<"+video.getFilmName()+">>?");
		
	}
	
	public void returnVideo(Video video){
		video.setLendOrNot(false);
	}
	
	
	
}
