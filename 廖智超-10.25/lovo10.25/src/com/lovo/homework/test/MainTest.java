package com.lovo.homework.test;

import com.lovo.homework.DoctorBean;
import com.lovo.homework.FarmerBean;
import com.lovo.homework.HunterBean;
import com.lovo.homework.RoguesBean;
import com.lovo.homework.SoldierBean;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoguesBean rogues = new RoguesBean("瓦莉拉",12,100);
		rogues.introduce();
		rogues.steal();
		System.out.println();
		
		HunterBean hunter = new HunterBean("雷克萨", 13, 150);
		hunter.introduce();
		hunter.hunt();
		System.out.println();
		
		FarmerBean farmer = new FarmerBean("苦工", 50, 1000);
		farmer.introduce();
		farmer.mining();
		System.out.println();
		
		SoldierBean soldier = new SoldierBean("加尔鲁什", 15, 200);
		soldier.introduce();
		soldier.anger();
		System.out.println();
		
		DoctorBean doctor = new DoctorBean("安度因",100,10000);
		doctor.introduce();
		doctor.cure(soldier);
		
	}

}
