package com.liao.home;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 登录，注册
 * 
 * @author spring
 *
 */
public class Exercise01 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] user=new String[2];
		int[] password=new int[2];
		while(true){
			selects(user,password);
		}
	}
	//登录
	public static void login(String[] user,int[] password){
		for(int i=1;i<=3;i++){
			Scanner input = new Scanner(System.in);
			boolean ifLogin=false;
			System.out.println("请输入用户名");
			String userName=input.nextLine();
			System.out.println("请输入密码");
			int pwd=input.nextInt();
			for(int j=0;j<user.length;j++){
				if(user[j].equals(userName)&&password[j]==pwd){
					System.out.println("登录成功");
					ifLogin=true;
					break;
				}
			}
			if(ifLogin==false&&i==3){
				System.out.println("输错三次，返回到主界面");
				selects(user,password);
			}
			if(ifLogin==false) System.out.println("输入有误,请重新输入");	
		}
		
	}
	//注册
	public static void register(String[] user,int[] password){
		boolean flag=false;
		for(int i=0;i<user.length;i++){
			Scanner input = new Scanner(System.in);
			System.out.println("请输入用户名：");
			String userName=input.nextLine();
			user[i]=userName;
			System.out.println("请输入密码：");
			int pwd=input.nextInt();
			password[i]=pwd;
			System.out.println("注册成功");
			if(i==user.length-1) flag=true;
		}
		if(flag==true) selects(user,password);
	}

	//界面
	public static void selects(String[] user,int[] password) {
		Scanner input = new Scanner(System.in);
		System.out.println("1.注册2.登录3.退出.");
		int select = input.nextInt();
		if (select == 1) {
			register(user,password);
		} else if (select == 2) {
			login(user,password);
		} else if (select == 3) {
			System.exit(0);
		}
	}
}
