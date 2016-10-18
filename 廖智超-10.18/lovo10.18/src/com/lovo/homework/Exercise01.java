package com.lovo.homework;

import java.util.Scanner;

//用户输入任意一个字符串，判断这个字符串当中有多少个am
public class Exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个字符串:");
		String str = scanner.nextLine();
		char[] array = str.toCharArray();
		int count = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == 'a' && array[i + 1] == 'm')
				count++;
		}
		System.out.println("这个字符串中有" + count + "个am");
	}

}
