package com.lovo.homework;

public class HunterBean extends RoleBean {

	public HunterBean(String name, int levle, int gold) {
		super(name, levle, gold);
		this.setPower(12, 2, 2);// 初始化体力、攻击力、防御力。
	}

	// 打猎
	public void hunt() {
		if (this.getPysicalPower() >= 8) {
			this.setGold(this.getGold() + 10);
			this.setPysicalPower(this.getPysicalPower() - 8);
			System.out.println(this.getName()+"消耗"+5+"点体力，获得"+10+"枚金币剩余金币"+this.getGold()+"剩余体力"+this.getPysicalPower());
		}else{
			System.out.println("您的体力不足，不能进行打猎");
		}
	}

}
