package com.lovo.homework;

public class Role{
	//属性
	private String name;
	
	private int level;
	//构造器
	public Role() {
		super();
	}

	public Role(String name, int level) {
		super();
		this.name = name;
		this.level = level;
	}
	//getter/setter
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
	//介绍
	public void introduce(){
		System.out.println("大家好，我是一个无名小卒，我的名字是"+this.name);
	}
}