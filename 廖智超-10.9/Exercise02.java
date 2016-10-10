package com.liao.home;
/**
 * 课本P62第二题
 */
import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("请输入成绩等级:");
		String grade=input.nextLine();
		if(grade.equals("A")) System.out.println("优秀");
		else if(grade.equals("B")||grade.equals("C")) System.out.println("不错");
		else if(grade.equals("D")) System.out.println("通过");
		else if(grade.equals("F")) System.out.println("要继续努力");
		else System.out.println("无效成绩");
		System.out.println("你的成绩等级是:"+grade);
	}

}
