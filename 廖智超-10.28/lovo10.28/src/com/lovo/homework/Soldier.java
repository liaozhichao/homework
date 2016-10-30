package com.lovo.homework;

public class Soldier extends Role{
	
	public Soldier(String name,int level) {
		// TODO Auto-generated constructor stub
		super(name,level);
	}
	
	public void defend(){
		System.out.println("士兵抵抗攻击");
	}
}
