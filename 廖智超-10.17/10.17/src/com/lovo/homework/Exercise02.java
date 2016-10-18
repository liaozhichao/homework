package com.lovo.homework;

//求一个分数序列，2/1,3/2,5/3前20项之和。
public class Exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n = 1;
		double m = 2;
		double sum = 0;
		double temp = 0;
		for (int i = 0; i < 20; i++) {
			sum += m / n;
			temp = n;
			n = m;
			m = m + temp;
		}
		System.out.println(sum);
	}

}
