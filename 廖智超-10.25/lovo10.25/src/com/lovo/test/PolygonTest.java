package com.lovo.test;

import com.lovo.bean.RightTriangle;

public class PolygonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Polygon po = new Polygon();
//		Triangle tr = new Triangle(5,9);
//		po.toString();
//		double area=tr.getArea();
//		System.out.println("三角形面积是"+area);
		RightTriangle rt = new RightTriangle(3, 4);
		System.out.println(rt.toString());
		System.out.println("该三角形面积是"+rt.getArea());
		System.out.println("该多边形边数是"+rt.getNumberOfSides());
		
	}

}
