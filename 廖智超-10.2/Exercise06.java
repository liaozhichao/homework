/**��Ŀ�����������������Ƕ������ɴ��⣺ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ��
 ���������(a>b)?a:b��������������Ļ������ӡ�
 */
package com.liao.homework;
import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������ѧ���ɼ�:");
		double grade=input.nextInt();
		char level=(grade>=90)?'A':(grade>=60&&grade<=89?'B':'C');
		System.out.println("��ѧ���ɼ��ȼ���"+level);
	}
}
