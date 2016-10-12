package com.liao.myself;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Manage {
	//新增
	public static void addGrade(ArrayList<Student> stuList){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入学生姓名");
		String name=input.nextLine();
		System.out.println("请输入学生语文成绩");
		double chineseGrade=input.nextDouble();
		Student stu=new Student(name,chineseGrade);
		stuList.add(stu);
		System.out.println("输入成绩成功");
		menue(stuList);
	}
	
	//修改
		public static void updateGrade(ArrayList<Student> stuList){
			Scanner input=new Scanner(System.in);
			System.out.println("请输入学生姓名：");
			String name=input.nextLine();
			System.out.println("请输入新的语文成绩：");
			double newChineseGrade=input.nextDouble();
			Iterator<Student> iterator=stuList.iterator();
			boolean flag=false;
			while(iterator.hasNext()){
				Student stu=iterator.next();
				String name2=stu.getName();
				if(name.equals(name2)){
					stu.setChineseGrade(newChineseGrade);
					System.out.println("修改后"+stu.getName()+"的语文成绩是"+stu.getChineseGrade());
					flag=true;
				}
			}
			if(flag==false) System.out.println("未找到该学生");
			menue(stuList);
		}
		
		//查询
		public static void searchGrade(ArrayList<Student> stuList){
			Scanner input=new Scanner(System.in);
			System.out.println("请输入学生姓名");
			String name=input.nextLine();
			//遍历List查询学生成绩。
			Iterator<Student> iterator=stuList.iterator();
			boolean flag=false;
			while(iterator.hasNext()){
				Student stu=(Student)iterator.next();
				String name2=stu.getName();
				double chineseGrade=stu.getChineseGrade();
				if(name.equals(name2)){
					System.out.println(name+"的语文成绩是:"+chineseGrade);
					flag=true;
				}		
			}	
			if(flag==false) System.out.println("未找到该学生");
			menue(stuList);
		}
		
		//查询所有人的分数。人名=分数,
			public static void searchAll(ArrayList<Student> stuList){
				Iterator<Student> iterator=stuList.iterator();
				while(iterator.hasNext()){
					Student stu=(Student) iterator.next();
					System.out.println(stu.getName()+"="+stu.getChineseGrade()+",");
				}
				menue(stuList);
			}
				
		//删除
		public static void delGrade(ArrayList<Student> stuList){
			Scanner input=new Scanner(System.in);
			System.out.println("请输入学生姓名：");
			String name=input.nextLine();
			Iterator<Student> iterator=stuList.iterator();
			boolean flag=false;
			while(iterator.hasNext()){
				Student stu=iterator.next();
				String name2=stu.getName();
				if(name.equals(name2)){
					stu.setChineseGrade(0);
					System.out.println("删除后"+name+"的语文成绩是"+stu.getChineseGrade());
					flag=true;
				}
			}
			if(flag==false) System.out.println("未找到该学生");
			menue(stuList);
		}
		//统计平均成绩
		public static void average(ArrayList<Student> stuList){
			double sum=0;
			int count=0;
			boolean flag=true;
			Iterator<Student> iterator=stuList.iterator();
			if(!iterator.hasNext()){
				System.out.println("还没有录入学生成绩。");
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
				System.out.println("学生平均成绩是:"+average);
				menue(stuList);
			}
		}
		//主菜单
		public static void menue(ArrayList<Student> stuList){
			Scanner input=new Scanner(System.in);
			System.out.println("1.新增成绩2.修改成绩3.查询成绩4.查询所有5.删除成绩6.统计成绩7.退出");
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
		//函数入口
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayList<Student> stuList=new ArrayList<Student>();
			menue(stuList);
		}
	}
