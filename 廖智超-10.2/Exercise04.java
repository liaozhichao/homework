/**
 * 
 * @author spring
 * 题目：输入学生3科成绩，计算平均分
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
			System.out.println("请输入第"+i+"科成绩");
			double grade=input.nextDouble();
			sum+=grade;
			i++;
		}
		double average=sum/3;
		System.out.println("三科成绩的平均分是:"+df.format(average));
	}
}
