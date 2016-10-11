package com.liao.home;
/**
 * µÝ¹é£¬Çò
 * @author spring
 *
 */
public class Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index=10;
		System.out.println(getDistance(index));
	}
	
	public static double getHeight(int index){
		if(index==1) return 100;
		return getHeight(index-1)/2;	
	}
	
	public static double getDistance(int index){
		if(index==1) return getHeight(1);
		else return 2*getHeight(index)+getDistance(index-1);
	}
}
