package com.lovo.test;
/**
 * �����������ҳ�������������Ҫ��ʹ�õ���֧��
 */
import java.util.Scanner;

public class Test1 {
/**
 * ��ӡ����������ӡ���������Ǹ���
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("�������һ��������");
		int a = input.nextInt();
		System.out.println("������ڶ���������");
		int b = input.nextInt();
		System.out.println("�����������������");
		int c = input.nextInt();
		int max = a;
		if(max < b) max = b;
		if(max < c) max = c;
		System.out.println(max);
	}
}
