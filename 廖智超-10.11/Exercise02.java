package com.liao.home;
/**
 * 99�˷���
 * @author spring
 *
 */
public class Exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		foo();
	}
	public static void foo(){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+i*j+" ");
			}
			System.out.println();
		}
	}
	
}
