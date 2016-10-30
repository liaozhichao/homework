package com.lovo.homework;

/**
 * 
 * @author spring
 * @version 1.0
 * @param name 名称
 * @param level 等级
 * @param pysicalPower 体力
 * @param attackPower 攻击力
 * @param defensivePower 防御力
 * @param gold 金币
 * @param pysicalPowerWeight 体力加权
 * @param attackPowerWeight 攻击力加权
 * @param defensivePowerWeight 防御力加权
 */
public class RoleBean {
	private String name;

	private int level;

	private int pysicalPower;

	private int attackPower;

	private int defensivePower;

	private int gold;

	private int pysicalPowerWeight;
	
	private int attackPowerWeight;
	
	private int defensivePowerWeight;
	// 构造方法
	public RoleBean() {
		super();
	}
	//构造方法初始化名称，等级，金币。
	public RoleBean(String name, int level, int gold) {
		super();
		this.name = name;
		this.level = level;
		this.gold = gold;
	}

	//设置属性
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public void setPysicalPower(int pysicalPower) {
		this.pysicalPower = pysicalPower;
	}
	
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	
	public void setDefensivePower(int defensivePower) {
		this.defensivePower = defensivePower;
	}
	
	public int getPysicalPower() {
		return pysicalPower;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public int getDefensivePower() {
		return defensivePower;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}
	
	public int getPysicalPowerWeight() {
		return pysicalPowerWeight;
	}

	public void setPysicalPowerWeight(int pysicalPowerWeight) {
		this.pysicalPowerWeight = pysicalPowerWeight;
	}

	public int getAttackPowerWeight() {
		return attackPowerWeight;
	}

	public void setAttackPowerWeight(int attackPowerWeight) {
		this.attackPowerWeight = attackPowerWeight;
	}

	public int getDefensivePowerWeight() {
		return defensivePowerWeight;
	}

	public void setDefensivePowerWeight(int defensivePowerWeight) {
		this.defensivePowerWeight = defensivePowerWeight;
	}

	//介绍
	public void introduce(){
		System.out.println("大叫好我是" + this.name+ "，我的等级是" + this.level);
	}
	
	//攻击
	public void attack(){
		System.out.println("攻击");
	}
	
	//防御
	private void defense(){
		System.out.println("防御");
	}
	
	//体力、攻击力、防御力、加权计算
	public void setPower(int pysicalPowerWeight,int attackPowerWeight,int defensivePowerWeight){
		this.setPysicalPowerWeight(pysicalPowerWeight);
		this.setAttackPowerWeight(attackPowerWeight);
		this.setDefensivePowerWeight(defensivePowerWeight);
		this.setPysicalPower(this.pysicalPowerWeight*this.level);
		this.setAttackPower(this.attackPowerWeight*this.level);
		this.setDefensivePower(this.defensivePowerWeight*this.level);
	}
}
