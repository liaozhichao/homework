package com.liao.myself;
//ѧ���ɼ�
public class Student {
	private String name;
	private double chineseGrade;
	
	public Student(String name,double chineseGrade){
		this.name=name;
		this.chineseGrade=chineseGrade;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getChineseGrade() {
		return chineseGrade;
	}
	public void setChineseGrade(double chineseGrade) {
		this.chineseGrade = chineseGrade;
	}
	
}
