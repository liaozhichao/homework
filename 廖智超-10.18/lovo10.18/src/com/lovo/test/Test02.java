package com.lovo.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个字母组成的字符串:");
		String str = scan.next();
		char[] array = str.toCharArray();
		System.out.println("原始字符数组是：" + Arrays.toString(array));
		// 请把array这个字符数组中的字母大写变小写，小写变大写。
		//考点：字符底层存储的是一个数字。
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 'A' && array[i] <= 'Z') {
				array[i] += 32;
			} else if (array[i] >= 'a' && array[i] <= 'z') {
				array[i] -= 32;
			}
		}
		System.out.println("修改后字符数组是：" + Arrays.toString(array));
	}

}
