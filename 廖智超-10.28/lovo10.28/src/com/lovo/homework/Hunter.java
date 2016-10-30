package com.lovo.homework;

import com.lovo.inter.Attackable;

public class Hunter extends Role implements Attackable{
	
	public Hunter(String name,int level) {
		// TODO Auto-generated constructor stub
		super(name,level);
	}
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("猎人的攻击");
	}
	
	public void hunt(){
		System.out.println("猎人打猎");
	}
	
}
