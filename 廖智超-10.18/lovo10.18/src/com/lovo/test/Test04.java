package com.lovo.test;

import java.util.Scanner;

//请输入3个组，每个组4个同学的成绩，找出其中最高分是多少
public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int[][] grade=new int[3][4];
	    int max=grade[0][0];
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				System.out.println("请输入第"+(i+1)+"组第"+(j+1)+"个同学成绩");
				grade[i][j]=scanner.nextInt();
				if(max<grade[i][j]) max=grade[i][j];
			}
		}
		System.out.println("最高分是"+max);
	}

}
