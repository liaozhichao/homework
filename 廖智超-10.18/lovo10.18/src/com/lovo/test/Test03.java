package com.lovo.test;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入第一个字符串：");
		String str1=scan.next();
		System.out.println("请输入第二个字符串：");
		String str2=scan.next();
		//请把两个字符数组array1和array2拼接到3当中，array1在array2前面
		char[] array1=str1.toCharArray();
		char[] array2=str2.toCharArray();
		char[] array3=new char[array1.length+array2.length];
		
		for(int i=0;i<array1.length;i++){
			array3[i]=array1[i];
		}
		
		for(int i=array1.length;i<array3.length;i++){
			array3[i]=array2[i-array1.length];
		}
		
		System.out.println("字符串数组array3是：");
		
		for(char ch:array3){
			System.out.print(ch);
		}
	}
}
