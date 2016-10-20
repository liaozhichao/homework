package com.lovo.test;

//类的定义---其本质就是在创建自定义数据类型。
public class Student {
	// 属性--使用变量或常量的语法声明属性，可以配上public这样的访问修饰符
	public String name;

	public int age;

	public boolean gender;

	public final String CLASS_NUMBER = "J132";

	// 行为
	public void study() {
		System.out.println("好好学习，天天向上！");
	}
	
	public static void main(String[] args) {
		
	}

}
