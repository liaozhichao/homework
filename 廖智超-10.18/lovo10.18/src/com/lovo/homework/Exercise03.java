package com.lovo.homework;

import java.util.Scanner;

public class Exercise03 {
	// 3*3矩阵，求对角线上数字的和。
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[][] array = new int[3][3];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("请输入第" + (i + 1) + "行第" + (j + 1) + "个数");
				array[i][j] = scanner.nextInt();
			}
		}
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == j) {
					sum += array[i][j];
					sum += array[i][2-j];
				}
			}
		}
		sum -= array[array.length / 2][array.length / 2];
		System.out.println("对角线上数字之和为" + sum);
	}

}
