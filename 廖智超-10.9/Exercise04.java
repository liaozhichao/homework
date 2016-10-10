package com.liao.home;
/**
 * P62课本第四题
 * @author spring
 *
 */
public class Exercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		a=(int)(Math.random()*10+1);
		System.out.println("a="+a);
		b=(int)(Math.random()*10+1);
		System.out.println("Trying b="+b);
		while(a==b){
			b=(int)(Math.random()*10+1);
			System.out.println("Trying b="+b);
		}
		System.out.println("a="+a+" and b = "+b);
	}

}
