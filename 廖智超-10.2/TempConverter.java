package com.liao.homework;
/**
 * author:Liao
 * Date:10.2
 * Content:��дһ��java���򣬽������¶�ת��Ϊ�����¶ȡ�
 */
import java.util.Scanner;
public class TempConverter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("������һ�������¶ȣ�");
		double F=input.nextDouble();
		double C=(5/9)*(F-32);
		System.out.println("����"+F+"��,������"+C+"��");
	}

}
