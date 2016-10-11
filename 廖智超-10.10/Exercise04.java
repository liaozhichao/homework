package com.liao.home;

import java.util.Arrays;

/**
 * 两个数组连接到一起,遍历新数组
 * @author spring
 *
 */
public class Exercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a={1,3,5,7,9};
		int [] b={2,4,6,8,10};
		int [] c=new int[a.length+b.length];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b,0,c,a.length,b.length);
		System.out.println(Arrays.toString(c));
	}

}
