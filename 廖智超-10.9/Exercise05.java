package com.liao.home;
/**
 * 一球能反弹100米高空，从100米高度自由下落，每次落地后反跳回原高度的一半。求它在第10次落地时共经过多少米。
 * 第10次反弹多高
 * @author spring
 *
 */
public class Exercise05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=100.0;
		double height1=100.0;
		for(int i=1;i<=9;i++){
			sum+=(height1/2)*2;
			height1/=2;
		}
		double height2=height1/2;
		System.out.println(String.format("小球经过%.2f米,第10次反弹%.2f米",sum,height2));
	}

}
