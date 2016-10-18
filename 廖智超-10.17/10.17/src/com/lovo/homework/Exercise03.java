package com.lovo.homework;

public class Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, old = 2, first = 0, second = 0, third = 0;
		for (i = 0; i < 20; i++) {
			old = old + third;
			third = second;
			second = first;
			first = old;
		}
		int sum = old + first + second + third;
		System.out.println(sum);
	}

}
