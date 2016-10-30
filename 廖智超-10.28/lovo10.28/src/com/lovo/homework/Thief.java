package com.lovo.homework;

import com.lovo.inter.Attackable;
import com.lovo.inter.Stealable;

public class Thief extends Role implements Stealable,Attackable{
	
	public Thief(String name,int level) {
		// TODO Auto-generated constructor stub
		super(name,level);
	}
	
	@Override
	public void steal() {
		// TODO Auto-generated method stub
		System.out.println("盗贼的偷盗");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("盗贼的攻击");
	}

}
