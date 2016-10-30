package com.lovo.test;

import java.util.Scanner;

import com.lovo.bean.UserBean;

public class TestLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 在系统中预存5个User对象放到一个长度为5的用户数组中
		Scanner scan = new Scanner(System.in);
		UserBean[] userArray = new UserBean[5];
		userArray[0] = new UserBean("张三","123");
		userArray[1] = new UserBean("李四","123");
		userArray[2] = new UserBean("王五","123");
		userArray[3] = new UserBean("周扒皮","123");
		userArray[4] = new UserBean("丁一","123");
		// 用户在外部输入用户名、密码进行登录;总共给三次机会
		System.out.println("**********登录**********");
		boolean flag = false;
		for (int i = 0; i < 3; i++) {
			System.out.println("请输入用您的户名");
			String name = scan.nextLine();
			System.out.println("请输入您的密码");
			String password = scan.nextLine();
			for (UserBean user : userArray) {
				if (user.getName().equals(name) && user.getPassword().equals(password)) {
					System.out.println("欢迎您," + user.getName());
					flag = true;
					break;
				}
			}
			if (flag)
				break;
		}   
		if (flag == false)
			System.out.println("三次机会均使用完！");
	}

}
