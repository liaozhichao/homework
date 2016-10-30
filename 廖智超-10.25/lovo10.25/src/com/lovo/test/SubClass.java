package com.lovo.test;

public class SubClass extends SuperClass{
	public SubClass(){
		super(1,2);
		System.out.println("子类构造器1");
	}
	
	public SubClass(int a){
		this();
		System.out.println("子类构造器2");
	}
	
	public SubClass(int a,int b){
		this(a);
		System.out.println("子类构造器3");
	}
}
