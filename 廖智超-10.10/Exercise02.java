package com.liao.home;

import java.util.Arrays;

/**
 * int []a=new int[10],10到1倒序存入数组，将数组中的数遍历出来并进行求和。
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
		System.out.println("数组a元素之和为"+sum);
	}

}
