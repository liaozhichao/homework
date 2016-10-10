package com.liao.home;
/**
 * 课本P62第一题
 * 
 */
import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter two numbers:");
		double highMinutes=input.nextDouble();
		double normalMinutes=input.nextDouble();
		double sum=300.0;
		if(highMinutes>400){
			sum+=0.4*(highMinutes-400);
		}
		if(normalMinutes>750){
			sum+=0.4*(normalMinutes-750);
		}
		System.out.println(String.format("用户这个月的账单是%.1f元",sum));	
	}

}
