/**
 * 
 * @author spring
 * ��Ŀ������ѧ��3�Ƴɼ�������ƽ����
 */
package com.liao.homework;
import java.util.Scanner;
import java.text.DecimalFormat;;

public class Exercise04 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.0");
		int i=1;
		double sum=0;
		while(i<=3){
			System.out.println("�������"+i+"�Ƴɼ�");
			double grade=input.nextDouble();
			sum+=grade;
			i++;
		}
		double average=sum/3;
		System.out.println("���Ƴɼ���ƽ������:"+df.format(average));
	}
}
