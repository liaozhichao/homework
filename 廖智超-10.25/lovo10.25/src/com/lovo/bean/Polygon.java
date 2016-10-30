package com.lovo.bean;

public class Polygon {
	private int sides;
	private double area;
	
	public Polygon(){
		super();
	}
	
	public Polygon(int sides){
		this.sides = sides;
		System.out.println("在Ploygon类的构造器中");
	}
	
	public int getSides() {
		return sides;
	}
	
	public void setSides(int sides) {
		this.sides = sides;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	//返回多边形边数
	public int getNumberOfSides(){
		System.out.println("该多边形的边数是"+this.sides);
		return this.sides;
	}
	//描述多边形信息
	public String toString(){
		return "这个多边形的边数是"+this.sides+"，面积是"+this.area;
	}
	
}
