package com.liao.homework;
/**
 * 
 * @author spring
 *
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Mortgage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.0");
		System.out.println("请输入贷款本金：");
		double pricipal=input.nextDouble();
		System.out.println("请输入利率：");
		double rate=input.nextDouble();
		System.out.println("请输入还款年限：");
		int years=input.nextInt();
		
		int N=years*12;
		double R=rate/(12*100);
		
		double perMonthPay=pricipal*(R/(1-Math.pow(1+R,-N)));
		System.out.println("每月还款额为"+df.format(perMonthPay)+"元");
	}

}
