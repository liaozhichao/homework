package com.liao.home;
/**
 * 求1*3*5*7到100以内的值
 * @author spring
 *
 */
public class Exercise01 {
	public static void main(String[] args) {
		long result=1;
		for(int i=1;i<100;i+=2){
			result*=i;
		}
		System.out.println("结果是"+result);
	}
}
