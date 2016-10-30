package com.lovo.bean;

public class Dog extends Pet {
	
	public Dog(){
		super();
	}
	
	public Dog(String name,int age,String hostName){
		super(name,age,hostName);
	}
	
	@Override
	public void play(){
		System.out.println(this.getName()+" is playing ball");
	}
	
	public void eat(){
		System.out.println(this.getName()+" is eating shit!");
	}
	
	public void eatShit(){
		System.out.println("我喜欢吃这个");
	}
}
