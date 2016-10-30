package com.lovo.bean;

public class RightTriangle extends Shape {
	private int base;
	private int height;

	public RightTriangle() {
		super();
	}

	public RightTriangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		if (base >= 1 && base <= 20) {
			this.base = base;
		} else {
			System.out.println("底范围在1-20之间，请检查您的输入");
		}
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if (height >= 1 && height <= 20) {
			this.height = height;
		} else {
			System.out.println("高度范围在1-20之间，请检查您的输入");
		}
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		for (int i = height - 1;i >= 0;i--) {
			if(i == height - 1){
				System.out.println("*");
				continue;
			}
			for (int j = 0; j < base - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RightTriangle rt = new RightTriangle();
		rt.draw();
	}

}
