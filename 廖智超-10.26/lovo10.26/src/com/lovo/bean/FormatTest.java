package com.lovo.bean;

public class FormatTest {
	public static int maxStringLength;
	
	public static double minSize;

	public static boolean testStringLength(String str){
		if(str.length() <= maxStringLength){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean testDouble(double number){
		if(number >= minSize){
			return true;
		}else{
			return false;
		}
	}
}
