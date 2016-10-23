package com.lovo.homework;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 1、请设计一个双色球号码自动生成器，运行起来以后可以自动生成出推荐号码。
      双色球号码规则：6个红球，1个兰球。其中红球数字范围从1-33，但不能重复。
      兰球范围1-16，可以和红球重复。请用面向对象的方式设计并实现。 
 */
public class Exercise01 {
	private ArrayList<Integer> redBall = new ArrayList<Integer>();

	private int blueBall;
	//用数组序列来存储红球，因为ArrayList拥有查重的方法contains(),返回值类型为布尔类型;
	public ArrayList<Integer> getRedBall() {
		return redBall;
	}

	public void setRedBall(ArrayList<Integer> redBall) {
		this.redBall = redBall;
	}

	public int getBlueBall() {
		return blueBall;
	}

	public void setBlueBall(int blueBall) {
		this.blueBall = blueBall;
	}

	// 无参构造器
	public Exercise01() {
		super();
	}

	// 流程控制方法
	public void run() {
		System.out.println("**********欢迎使用双色球自动生成器**********");
		this.generateRed();
		this.genreateBlue();
		System.out.print("您的红色球号码分别为：");
		
		//打印出红色球号码
		Iterator<Integer> it = this.redBall.iterator();
		while(it.hasNext()){
			Integer i = it.next();
			System.out.print(i+",");
		}
		System.out.println();
		//打印出蓝色球号码
		System.out.print("您的蓝色球号码为：");
		System.out.println(this.blueBall);
		System.out.println("********谢谢您的使用，欢迎再次光临********");
	}

	//随机生成红球
	private void generateRed() {
		while (true) {
			int i = (int) (Math.random() * 33) + 1;
			//如果数组序列中不包含i，则将i添加到数组序列当中
			if (!this.redBall.contains(i)){
				this.redBall.add(i);
			}
			//如果生成了6个数则结束循环
			if(this.redBall.size()==6){
				break;
			}
		}
	}
	
	//随机生成蓝球
	private void genreateBlue() {
		this.blueBall = (int) (Math.random() * 16) + 1;
	}
	
	//测试
	public static void main(String[] args) {
		Exercise01 ex01 = new Exercise01();
		ex01.run();
	}

}
