/**
 * 市场价格、购买价格 ，计算市场价格 - 购买价格？注意：输入用整形（int）取，显示用float类型？
 */
package com.liao.homework;
import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("请输入市场价格:");
		int marketPrice=input.nextInt();
		System.out.println("请输入购买价格:");
		int buyPrice=input.nextInt();
		
		float result=marketPrice-buyPrice;
		System.out.println("结果是"+result);
	}

}
