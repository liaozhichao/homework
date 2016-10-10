package com.liao.home;

import java.util.Scanner;

/**
 * 课本P62第三题
 * @author spring
 *
 */
public class Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个正整数：");
		int num=input.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++){
			sum+=i;
			if(i==num){
				System.out.print(i+"="+sum);
				break;
			}
			System.out.print(i+"+");
			
		}

	}
}
