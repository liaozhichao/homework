package com.lovo.homework;

import com.lovo.inter.Cureable;

public class Doctor extends Role implements Cureable{
	public Doctor(String name,int level) {
		// TODO Auto-generated constructor stub
		super(name,level);
	}
	@Override
	public void cure() {
		// TODO Auto-generated method stub
		System.out.println("医生的治疗");
	}
}
