package com.lovo.bean;

public class Cat extends Pet {
	public Cat(){
		super();
	}
	
	public Cat(String name,int age,String hostName){
		super(name,age,hostName);
	}
	
	public void catchMouse(){
		System.out.println("抓老鼠");
	}
	
	public void eat(){
		System.out.println(this.getName() +" is eating little fish");
	}
	
	public void play(){
		System.out.println(this.getName()+" is chasing mouse");
	}
}
 