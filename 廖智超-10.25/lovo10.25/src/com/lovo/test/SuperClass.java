package com.lovo.test;

public class SuperClass {
	public SuperClass(){
		System.out.println("父类构造器1");
	}
	
	public SuperClass(int a){
		this();
		System.out.println("父类构造器2");
	}
	
	public SuperClass(int a,int b){
		this(a);
		System.out.println("父类构造器3");
	}
	
}
