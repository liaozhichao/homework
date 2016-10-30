package com.lovo.bean;

public abstract class Pet {
	private String name;
	
	public  int age;
	
	public String hostName;
	
	public Pet() {
		super();
	}

	public Pet(String name, int age, String hostName) {
		super();
		this.name = name;
		this.age = age;
		this.hostName = hostName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	
	public abstract void eat();
	
	public abstract void play();
}
