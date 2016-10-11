package com.liao.home;

import java.util.Arrays;

/**
 * 引用类型String=“569431”，转换为char数组并且遍历。
 * 要用到toCharArray()方法。
 * @author spring
 *
 */
public class Exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String classOne="569431";
		char[] x=classOne.toCharArray();
		System.out.println(Arrays.toString(x));
	}

}
