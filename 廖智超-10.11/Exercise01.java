package com.liao.home;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ��¼��ע��
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
	//��¼
	public static void login(String[] user,int[] password){
		for(int i=1;i<=3;i++){
			Scanner input = new Scanner(System.in);
			boolean ifLogin=false;
			System.out.println("�������û���");
			String userName=input.nextLine();
			System.out.println("����������");
			int pwd=input.nextInt();
			for(int j=0;j<user.length;j++){
				if(user[j].equals(userName)&&password[j]==pwd){
					System.out.println("��¼�ɹ�");
					ifLogin=true;
					break;
				}
			}
			if(ifLogin==false&&i==3){
				System.out.println("������Σ����ص�������");
				selects(user,password);
			}
			if(ifLogin==false) System.out.println("��������,����������");	
		}
		
	}
	//ע��
	public static void register(String[] user,int[] password){
		boolean flag=false;
		for(int i=0;i<user.length;i++){
			Scanner input = new Scanner(System.in);
			System.out.println("�������û�����");
			String userName=input.nextLine();
			user[i]=userName;
			System.out.println("���������룺");
			int pwd=input.nextInt();
			password[i]=pwd;
			System.out.println("ע��ɹ�");
			if(i==user.length-1) flag=true;
		}
		if(flag==true) selects(user,password);
	}

	//����
	public static void selects(String[] user,int[] password) {
		Scanner input = new Scanner(System.in);
		System.out.println("1.ע��2.��¼3.�˳�.");
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
