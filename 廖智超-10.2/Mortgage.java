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
		System.out.println("����������");
		double pricipal=input.nextDouble();
		System.out.println("���������ʣ�");
		double rate=input.nextDouble();
		System.out.println("�����뻹�����ޣ�");
		int years=input.nextInt();
		
		int N=years*12;
		double R=rate/(12*100);
		
		double perMonthPay=pricipal*(R/(1-Math.pow(1+R,-N)));
		System.out.println("ÿ�»����Ϊ"+df.format(perMonthPay)+"Ԫ");
	}

}
