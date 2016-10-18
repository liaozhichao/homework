package com.lovo.homework;

import java.util.Scanner;

//定义一个方法，方法名为compare，传入两个字符串，返回这两个字符串之差。
//首先比较首个不同字母的ASCII码之差。
//如果每一位都一样，那比较长度。
public class Exercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入第一个字符串");
		String str1=scanner.nextLine();
		System.out.println("请输入第二个字符串");
		String str2=scanner.nextLine();
		System.out.println("两个字符串差值为"+compare(str1, str2));
	}
	public static int compare(String str1,String str2){
		int result=0;
		char[] a1=str1.toCharArray();
		char[] a2=str2.toCharArray();
		int length1=a1.length;
		int length2=a2.length;
		boolean flag=false;
		int tempLength=Math.min(length1, length2);
		for(int i=0;i<tempLength;i++){
			if(a1[i]!=a2[i]){
				result+=a1[i]-a2[i];
				flag=true;
			}
		}
		if(flag==false) result=length1-length2;
		return result;
	}
	
}
