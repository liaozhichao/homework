package com.lovo.homeworktest;

import com.lovo.homework1.Arrow;
import com.lovo.homework1.BlueGem;
import com.lovo.homework1.Gem;
import com.lovo.homework1.GreenGem;
import com.lovo.homework1.Knife;
import com.lovo.homework1.RedGem;
import com.lovo.homework1.Soldier;
import com.lovo.homework1.Sword;
import com.lovo.homework1.Weapon;
import com.lovo.homework1.YellowGem;

public class GameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		//创建战士
		Soldier soldier = new Soldier();
		//创建武器对象
		Weapon w1 = new Knife();
		Weapon w2 = new Sword();
		Weapon w3 = new Arrow();
		//创建宝石对象
		Gem g1 = new RedGem();
		Gem g2 = new GreenGem();
		Gem g3 = new BlueGem();
		Gem g4 = new YellowGem();
		//组合，武器，宝石
		soldier.setWeapon(w1);
		soldier.getWeapon().attack(g1);
		
		soldier.setWeapon(w2);
		soldier.getWeapon().attack(g2);
		
		soldier.setWeapon(w3);
		soldier.getWeapon().attack(g3);
		
		soldier.setWeapon(w2);
		soldier.getWeapon().attack(g4);
		
	}

}
