package com.lovo.homework;

public class DoctorBean extends RoleBean {
	public DoctorBean(String name, int Level, int gold) {
		super(name, Level, gold);
		this.setPower(8, 1, 2);// 初始化体力、攻击力、防御力。
	}

	// 治疗,传入一个角色。
	public void cure(RoleBean role){
		int treatment = this.getLevel() * 2;//医生能进行多少点治疗
		int maxPysicalPower = role.getLevel() * role.getPysicalPowerWeight();
		int otherMaxPysicalPower = role.getLevel() * role.getPysicalPowerWeight();
		//通过名字判断是不是本人
		if(role.getName().equals(this.getName())){
			//体力最多恢复到上限
			if(this.getPysicalPower() + treatment >= maxPysicalPower){
				this.setPysicalPower(maxPysicalPower);
				System.out.println("您已恢复到体力上限");
			}else{
				this.setPysicalPower(this.getPysicalPower() + treatment);
				System.out.println("您获得了"+treatment+"点治疗");
			}
		}else{
			//不是本人，先收钱，再治疗。类似银行。
			if(role.getGold() >= treatment){
				if(role.getPysicalPower() + treatment >= otherMaxPysicalPower){
					int pay = role.getPysicalPower() + treatment - otherMaxPysicalPower;
					role.setGold(pay);
					role.setPysicalPower(otherMaxPysicalPower);
					System.out.println(role.getName()+"花费"+pay+"金币，恢复了全部体力");
				}else{
					role.setGold(treatment);
					role.setPysicalPower(role.getPysicalPower() + treatment);
					System.out.println(role.getName()+"花费"+treatment+"金币获得了"+treatment+"点治疗");
				}
			}else{
				System.out.println("您的金币不足，无法进行治疗");
			}
		}
	}

}
