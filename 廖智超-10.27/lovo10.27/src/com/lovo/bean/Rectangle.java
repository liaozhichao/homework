package com.lovo.bean;

public class Rectangle extends Shape{
	private int height;
	
	private int width;
	
	
	public Rectangle() {
		super();
	}

	public Rectangle(int width, int height) {
		super();
		this.setHeight(height);
		this.setWidth(width);
	}


	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if(height >= 1 && height <= 15){
			this.height = height;
		}else{
			System.out.println("高度范围在1-15之间，请检查您的输入");
		}
		
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		if(height >= 1 && height <= 15){
			this.width = width;
		}else{
			System.out.println("高度范围在1-15之间，请检查您的输入");
		}
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		for(int i = 0;i < this.height;i++){
			for(int j = 0;j<this.width;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(3,5);
		r.draw();
		
	}
}
