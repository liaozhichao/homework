package com.liao.myself;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Manage {
	//����
	public static void addGrade(ArrayList<Student> stuList){
		Scanner input=new Scanner(System.in);
		System.out.println("������ѧ������");
		String name=input.nextLine();
		System.out.println("������ѧ�����ĳɼ�");
		double chineseGrade=input.nextDouble();
		Student stu=new Student(name,chineseGrade);
		stuList.add(stu);
		System.out.println("����ɼ��ɹ�");
		menue(stuList);
	}
	
	//�޸�
		public static void updateGrade(ArrayList<Student> stuList){
			Scanner input=new Scanner(System.in);
			System.out.println("������ѧ��������");
			String name=input.nextLine();
			System.out.println("�������µ����ĳɼ���");
			double newChineseGrade=input.nextDouble();
			Iterator<Student> iterator=stuList.iterator();
			boolean flag=false;
			while(iterator.hasNext()){
				Student stu=iterator.next();
				String name2=stu.getName();
				if(name.equals(name2)){
					stu.setChineseGrade(newChineseGrade);
					System.out.println("�޸ĺ�"+stu.getName()+"�����ĳɼ���"+stu.getChineseGrade());
					flag=true;
				}
			}
			if(flag==false) System.out.println("δ�ҵ���ѧ��");
			menue(stuList);
		}
		
		//��ѯ
		public static void searchGrade(ArrayList<Student> stuList){
			Scanner input=new Scanner(System.in);
			System.out.println("������ѧ������");
			String name=input.nextLine();
			//����List��ѯѧ���ɼ���
			Iterator<Student> iterator=stuList.iterator();
			boolean flag=false;
			while(iterator.hasNext()){
				Student stu=(Student)iterator.next();
				String name2=stu.getName();
				double chineseGrade=stu.getChineseGrade();
				if(name.equals(name2)){
					System.out.println(name+"�����ĳɼ���:"+chineseGrade);
					flag=true;
				}		
			}	
			if(flag==false) System.out.println("δ�ҵ���ѧ��");
			menue(stuList);
		}
		
		//��ѯ�����˵ķ���������=����,
			public static void searchAll(ArrayList<Student> stuList){
				Iterator<Student> iterator=stuList.iterator();
				while(iterator.hasNext()){
					Student stu=(Student) iterator.next();
					System.out.println(stu.getName()+"="+stu.getChineseGrade()+",");
				}
				menue(stuList);
			}
				
		//ɾ��
		public static void delGrade(ArrayList<Student> stuList){
			Scanner input=new Scanner(System.in);
			System.out.println("������ѧ��������");
			String name=input.nextLine();
			Iterator<Student> iterator=stuList.iterator();
			boolean flag=false;
			while(iterator.hasNext()){
				Student stu=iterator.next();
				String name2=stu.getName();
				if(name.equals(name2)){
					stu.setChineseGrade(0);
					System.out.println("ɾ����"+name+"�����ĳɼ���"+stu.getChineseGrade());
					flag=true;
				}
			}
			if(flag==false) System.out.println("δ�ҵ���ѧ��");
			menue(stuList);
		}
		//ͳ��ƽ���ɼ�
		public static void average(ArrayList<Student> stuList){
			double sum=0;
			int count=0;
			boolean flag=true;
			Iterator<Student> iterator=stuList.iterator();
			if(!iterator.hasNext()){
				System.out.println("��û��¼��ѧ���ɼ���");
				flag=false;
				menue(stuList);
			}
			while(iterator.hasNext()){
				Student stu=iterator.next();
				sum+=stu.getChineseGrade();
				count++;
			}
			if(flag==true){
				double average=sum/count++;
				System.out.println("ѧ��ƽ���ɼ���:"+average);
				menue(stuList);
			}
		}
		//���˵�
		public static void menue(ArrayList<Student> stuList){
			Scanner input=new Scanner(System.in);
			System.out.println("1.�����ɼ�2.�޸ĳɼ�3.��ѯ�ɼ�4.��ѯ����5.ɾ���ɼ�6.ͳ�Ƴɼ�7.�˳�");
			int choice=input.nextInt();
			switch(choice){
			case 1:addGrade(stuList);
			break;
			case 2:updateGrade(stuList);
			break;
			case 3:searchGrade(stuList);
			break;
			case 4:searchAll(stuList);
			break;
			case 5:delGrade(stuList);
			break;
			case 6:average(stuList);
			break;
			case 7:System.exit(0);
			break;
			}
		}
		//�������
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayList<Student> stuList=new ArrayList<Student>();
			menue(stuList);
		}
	}
