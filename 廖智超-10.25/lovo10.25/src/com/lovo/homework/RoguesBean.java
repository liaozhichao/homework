package com.lovo.homework;
/**
 * 盗贼类
 * @author spring
 *
 */
public class RoguesBean extends RoleBean{
	//盗贼初始化
	public RoguesBean(String name,int levle,int gold){
		super(name,levle,gold);
		this.setPower(10,3,1);//初始化体力、攻击力、防御力。
	}
	
	//偷盗
	public void steal(){
		if(this.getPysicalPower() >= 9){
			this.setGold(this.getGold() + 12);
			this.setPysicalPower(this.getPysicalPower() - 9);
			System.out.println(this.getName()+"消耗"+9+"点体力，获得"+12+"枚金币剩余金币"+this.getGold()+"剩余体力"+this.getPysicalPower());
		}else{
			System.out.println("您的体力不足，不能进行偷盗");
		}
	}
	
}
