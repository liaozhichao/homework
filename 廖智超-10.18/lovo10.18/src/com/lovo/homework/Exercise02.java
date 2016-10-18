package com.lovo.homework;

import java.util.Arrays;
import java.util.Scanner;

//用户输入任意一个字符串，找出里面的字母a，并把它从数组中删除。
public class Exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个字符串:");
		String str = scanner.nextLine();
		char[] array = str.toCharArray();
		System.out.println("删除字母a之前的数组是" + Arrays.toString(array));
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 'a') {
				index++;
				continue;
			}
			array[i - index] = array[i];
		}
		char[] array2 = new char[array.length - index];
		for (int i = 0; i < array.length - index; i++) {
			array2[i] = array[i];
		}
		System.out.println("删除字母a后的数组是" + Arrays.toString(array2));
	}
}
