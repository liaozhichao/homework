package com.liao.home;

import java.util.Arrays;

/**
 * int []a=new int[10],10��1����������飬�������е�������������������͡�
 * @author spring
 *
 */
public class Exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[10];
		int j=10;
		int sum=0;
		for(int i=0;i<a.length;i++){
			a[i]=j;
			sum+=a[i];
			j--;
		}
		System.out.println(Arrays.toString(a));
		System.out.println("����aԪ��֮��Ϊ"+sum);
	}

}
