package com.lovo.homework;

public class SoldierBean extends RoleBean{
	public SoldierBean(String name, int levle, int gold){
		super(name, levle, gold);
		this.setPower(15, 2, 3);// 初始化体力、攻击力、防御力。
	}
	//狂暴
	public void anger(){
		if(this.getPysicalPower() >= 1){
			this.setPysicalPower(this.getPysicalPower()/2);
			this.setAttackPower(this.getAttackPower()*2);
			this.setDefensivePower(this.getDefensivePower()*2);
			System.out.println(this.getName() + "进入狂暴状态，目前的体力值为"+this.getPysicalPower());
		}else{
			System.out.println("您的体力值不足，不能进行狂暴");
		}
	}
}
