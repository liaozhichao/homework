package com.liao.home;
/**
 * 100以内同时被3和5整除的数，输出
 * @author spring
 *
 */
public class Exercise02 {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++){
			if(i%3==0&&i%5==0){
				System.out.print(i+" ");
			}
		}
	}
}
