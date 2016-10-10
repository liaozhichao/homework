/**
 * 输入一个数，判断是不是水仙花数。
 */
package com.liao.homework;
import java.util.Scanner;
public class Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个三位正整数:");
		int number=input.nextInt();
		int temp=number;
		int sum=0;
		
		while(number>0){
			int i=number%10;
			sum+=Math.pow(i, 3);
			number/=10;
		}
		
		if(sum==temp){
			System.out.println("这个数是水仙花数");
		}
		else{
			System.out.println("这个数不是水仙花数");
		}
			
	}

}
