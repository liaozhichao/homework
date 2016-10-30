package com.lovo.test;

import com.lovo.homework.Assassin;
import com.lovo.homework.Doctor;
import com.lovo.homework.Farmer;
import com.lovo.homework.Hunter;
import com.lovo.homework.Soldier;
import com.lovo.homework.Thief;

public class GameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assassin assassin = new Assassin("瓦莉拉",12);
		Doctor doctor = new Doctor("安度因",12);
		Farmer farmer = new Farmer("苦工",12);
		Hunter hunter = new Hunter("雷克萨",12);
		Soldier soldier = new Soldier("地狱咆哮",12);
		Thief thief = new Thief("萨古纳尔",12);
		
		assassin.introduce();
		doctor.cure();
		farmer.mine();
		hunter.hunt();
		soldier.defend();
		thief.steal();
	}

}
