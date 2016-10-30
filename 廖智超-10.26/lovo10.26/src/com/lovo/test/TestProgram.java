package com.lovo.test;

import java.util.Scanner;

import com.lovo.bean.FormatTest;

public class TestProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String str = scan.nextLine();
		System.out.println("请输入一个double类型的数字");
		double number = scan.nextDouble();
		
		FormatTest.maxStringLength = 12;
		FormatTest.minSize = 100.0;
		System.out.println(FormatTest.testStringLength(str));
		System.out.println(FormatTest.testDouble(number));
		
	}

}
