package com.lovo.bean;

public class RightTriangle extends Triangle{
	private double hypotenuse;
	
	public RightTriangle(int base,int height){
		super(base,height);
		this.hypotenuse = Math.sqrt(this.getBase()*this.getBase()+this.getHeight()*this.getHeight());
		System.out.println("在RightTriangle的构造器中");
	}
	
	public String toString(){
		return super.toString()+"该三角形的斜边是"+this.hypotenuse;
	}
	
	
}
