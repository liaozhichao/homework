package com.lovo.homework;

import com.lovo.inter.Cureable;

public class Farmer extends Role implements Cureable{
	public Farmer(String name,int level) {
		// TODO Auto-generated constructor stub
		super(name,level);
	}
	
	@Override
	public void cure() {
		// TODO Auto-generated method stub
		System.out.println("农民的治疗");
	}
	
	public void mine(){
		System.out.println("农民挖矿");
	}
}
