package com.liao.home;
/**
 * �α�P62�ڶ���
 */
import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("������ɼ��ȼ�:");
		String grade=input.nextLine();
		if(grade.equals("A")) System.out.println("����");
		else if(grade.equals("B")||grade.equals("C")) System.out.println("����");
		else if(grade.equals("D")) System.out.println("ͨ��");
		else if(grade.equals("F")) System.out.println("Ҫ����Ŭ��");
		else System.out.println("��Ч�ɼ�");
		System.out.println("��ĳɼ��ȼ���:"+grade);
	}

}
