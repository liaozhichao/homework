package com.lovo.homework1;

public class Sword extends Weapon {

	@Override
	public void attack(Gem gem) {
		// TODO Auto-generated method stub
		System.out.println(gem.getAbility()+"刺杀");
	}

}
