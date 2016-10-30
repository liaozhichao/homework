package com.lovo.bean;

public class Ladder extends Shape {
	private int rungs;

	public Ladder() {
		super();
	}

	public Ladder(int rungs) {
		this.rungs = rungs;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("**************************");
		for (int j = 0; j < 2; j++) {
			for (int i = 0; i < this.rungs; i++) {
				System.out.print("*");
				System.out.print("     ");
			}
			System.out.println();
		}
		System.out.println("**************************");
	}

}
