package com.liao.home;

import java.util.Arrays;

/**
 * int [] a={5,3,9,2,4},a数组拷贝到b数组中然后遍历b数组。
 * @author spring
 *
 */
public class Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a={5,3,9,2,4};
		int [] b=new int[a.length];
		System.arraycopy(a,0,b,0,a.length);
		System.out.println(Arrays.toString(b));
	}

}
