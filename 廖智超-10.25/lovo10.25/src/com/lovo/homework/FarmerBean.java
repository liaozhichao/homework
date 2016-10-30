package com.lovo.homework;

public class FarmerBean extends RoleBean{
	public FarmerBean(String name, int levle, int gold){
		super(name, levle, gold);
		this.setPower(8, 1, 1);// 初始化体力、攻击力、防御力。
	}
	
	//挖矿
	public void mining(){
		if (this.getPysicalPower() >= 3) {
			this.setGold(this.getGold() + 5);
			this.setPysicalPower(this.getPysicalPower() - 3);
			System.out.println(this.getName()+"消耗"+3+"点体力，获得"+5+"枚金币剩余金币"+this.getGold()+"剩余体力"+this.getPysicalPower());
		}else{
			System.out.println("您的体力不足，不能进行挖矿");
		}
	}
}
