/**
 * ����һ�������ж��ǲ���ˮ�ɻ�����
 */
package com.liao.homework;
import java.util.Scanner;
public class Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("������һ����λ������:");
		int number=input.nextInt();
		int temp=number;
		int sum=0;
		
		while(number>0){
			int i=number%10;
			sum+=Math.pow(i, 3);
			number/=10;
		}
		
		if(sum==temp){
			System.out.println("�������ˮ�ɻ���");
		}
		else{
			System.out.println("���������ˮ�ɻ���");
		}
			
	}

}
