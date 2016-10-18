package com.lovo.test;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入学生的成绩：");
		double grade = input.nextDouble();
		String level = "";
		if (grade >= 90)
			level = "A";
		else if (grade >= 80)
			level = "B";
		else if (grade >= 60)
			level = "C";
		else if (grade >= 40)
			level = "D";
		else
			level = "E";
		System.out.println("学生成绩对应的等级是" + level);
	}

}
