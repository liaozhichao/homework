/**题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
 程序分析：(a>b)?a:b这是条件运算符的基本例子。
 */
package com.liao.homework;
import java.util.Scanner;

public class Exercise06 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入学生成绩:");
		double grade=input.nextInt();
		char level=(grade>=90)?'A':(grade>=60&&grade<=89?'B':'C');
		System.out.println("该学生成绩等级是"+level);
	}
}
