package com.lovo.bean;

public class Triangle extends Polygon {
	private int base;
	
	private int height;
	
	public Triangle() {
		super();
	}
	
	public Triangle(int base,int height){
		super(3);
		this.base = base;
		this.height =height;
		System.out.println("在Trangle构造器中");
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public String toString(){
		return "三角形的底是"+this.base+"，高是"+this.height;
	}
	//计算三角形面积
	public double getArea(){
		return (this.height*this.base)/2.0;
	}
	//
}
