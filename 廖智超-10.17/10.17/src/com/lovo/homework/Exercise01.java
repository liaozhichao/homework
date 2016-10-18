package com.lovo.homework;

import java.util.Scanner;

/*
 * 输入年月日，输出这是这年的第几天 
 */
public class Exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年:");
		int year = scanner.nextInt();
		System.out.println("请输入月:");
		int month = scanner.nextInt();
		System.out.println("请输入日:");
		int day = scanner.nextInt();

		int[] months = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		boolean ifLeapYear = false;
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			ifLeapYear = true;
		}
		if (ifLeapYear) {
			months[2] = 29;
		}
		int result = 0;
		for (int i = 0; i < month; i++) {
			result += months[i];
		}
		result += day;
		System.out.println(year + "年" + month + "月" + day + "日" + "是该年的第" + result + "天");
	}

}
