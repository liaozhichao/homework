/**
 * �г��۸񡢹���۸� �������г��۸� - ����۸�ע�⣺���������Σ�int��ȡ����ʾ��float���ͣ�
 */
package com.liao.homework;
import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("�������г��۸�:");
		int marketPrice=input.nextInt();
		System.out.println("�����빺��۸�:");
		int buyPrice=input.nextInt();
		
		float result=marketPrice-buyPrice;
		System.out.println("�����"+result);
	}

}
