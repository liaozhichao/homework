package com.liao.homework;
/**
 * author:Liao
 * Date:10.2
 * Content:编写一个java程序，将华氏温度转换为摄氏温度。
 */
import java.util.Scanner;
public class TempConverter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个摄氏温度：");
		double F=input.nextDouble();
		double C=(5/9)*(F-32);
		System.out.println("华氏"+F+"度,是摄氏"+C+"度");
	}

}
