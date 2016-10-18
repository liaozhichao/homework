package com.lovo.test;
/**
 * 输入三个数找出其中最大的数。要求使用单分支。
 */
import java.util.Scanner;

public class Test1 {
/**
 * 打印三个数，打印其中最大的那个。
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int a = input.nextInt();
		System.out.println("请输入第二个整数：");
		int b = input.nextInt();
		System.out.println("请输入第三个整数：");
		int c = input.nextInt();
		int max = a;
		if(max < b) max = b;
		if(max < c) max = c;
		System.out.println(max);
	}
}
