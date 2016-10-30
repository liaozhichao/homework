package com.lovo.test;

import com.lovo.bean.StudentBean;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentBean[] students = new StudentBean[5];
		for (int i = 0; i < students.length; i++) {
			students[i] = new StudentBean("king" + i, 20 + i, 80 + i);
		}
		// 打印出成绩最高的学生的学生名字和年龄，以及他在数组中排第几位；
		int maxScore = students[0].getScore();
		int temp = 0;
		for (int i = 1; i < students.length; i++) {
			if (students[i].getScore() > maxScore) {
				maxScore = students[i].getScore();
				temp = i;
			}
		}
		System.out.println(
				"成绩最高分的学生的姓名是" + students[temp].getName() + "，年龄是" + students[temp].getAge() + "，他在数组中排第" + temp + "位");

		// 将数组中的学生元素安分数从高到低排序。
		StudentBean temp2 = null;
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length - 1-i; j++) {
				if (students[j].getScore() < students[j + 1].getScore()) {
					temp2 = students[j];
					students[j] = students[j + 1];
					students[j + 1] = temp2;
				}
			}
		}
		// 打印从高到低的学生成绩排序
		System.out.println();
		System.out.println("打印从高到低的学生成绩排序");
		for (StudentBean stu : students) {
			System.out.print(stu.getScore() + " ");
		}
	}

}
