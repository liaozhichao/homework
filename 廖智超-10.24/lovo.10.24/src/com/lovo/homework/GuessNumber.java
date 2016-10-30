package com.lovo.homework;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 2、请设计一个“猜数字”游戏机。游戏规则：游戏运行起来在后台随机生成一个4位数，
      该4位数的每一位都不相同（0可以开头）；玩家在界面输入猜测的数字，游戏用后台
      数字与玩家的输入进行比较 。如果玩家输入的数字在后台数据中存在，但位置不同则
      计为1个B，如果玩家输入的数字在后台数据中存在且位置相同，则计为1个A。例如：
      后台数据是0293，如果玩家输入1234，则应该返回1A1B;如果玩家输入5678.则
      应该返回0A0B；如果玩家输入9012，则应该返回0A3B；也就是说只有返回4A0B，
      才算猜正确。玩家每次可以猜测7次。请用面向对象的方式设计并实现。
      
 */
public class GuessNumber {
	// 属性
	private int[] generateNumber = new int[4];// 存放数字

	private int a;// 猜中数字且位置相同的次数

	private int b;// 猜中数字但位置不同的次数

	// 构造方法
	public GuessNumber() {
		super();
	}

	public int[] getGenerateNumber() {
		return generateNumber;
	}

	public void setGenerateNumber(int[] generateNumber) {
		this.generateNumber = generateNumber;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	// 流程控制方法
	public void run() {
		System.out.println("**********欢迎来到猜数字游戏**********");
		this.generateNumber();// 后台生成数字
		for (int i = 1; i <= 7; i++) {
			// 判断是否猜中数字
			boolean flag = this.guessNumber(i);
			if (flag == true) {
				System.out.println("计算结果是结果是：" + this.a + "A " + this.b + "B");
				System.out.println("恭喜您，成功了！");
				// 判断是否继续
				if (this.ifContinue()) {
					this.run();
				} else {
					System.exit(0);
				}
			} else {
				System.out.println("计算结果是：" + this.a + "A " + this.b + "B");
				if (i == 7) {// 连续7次没有猜中数字
					System.out.println("抱歉，您的7机会已用完");
					System.out.println("正确答案是"+Arrays.toString(this.generateNumber));
					// 判断是否继续
					if (this.ifContinue()) {
						this.run();
					} else {
						System.exit(0);
					}
				}
				System.out.println("大侠请重新来过！");
			}
		}
	}

	// 后台生成4位数字
	private void generateNumber() {
		for(int i = 0;i<4;i++){
			this.generateNumber[i]=(int)(Math.random()*10);;
			for(int j =0;j<i;j++){
				if(generateNumber[i]==generateNumber[j]){
					i--;
					break;
				}
			}
		}
	}

	// 玩家输入猜测的数字,将这个数字和后台生成的数字作比较
	private boolean guessNumber(int times) {
		//初始化a和b
		this.a = 0;
		this.b = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个4位数，第" + times + "次:");
		// 将用户输入的数字转换为数组
		int inputNumber = scan.nextInt();
		int[] guessNumber = new int[4];
		for (int i = guessNumber.length - 1; i >= 0; i--) {
			guessNumber[i] = inputNumber % 10;
			inputNumber /= 10;
		}
		boolean flag = false;

		// 第一层循环计算数字相同且位置相同的情况。
		// 第二层循环计算位置不同，但是有相同数字的情况。
		for (int i = 0; i < guessNumber.length; i++) {
			if (guessNumber[i] == this.generateNumber[i]) {
				this.a++;
			} else {
				for (int j = 0; j < this.generateNumber.length; j++) {
					if (guessNumber[i] == this.generateNumber[j]) {
						this.b++;
					}
				}
			}
		}
		// 如果A情况占4个，说明全部猜对。
		if (this.a == 4) {
			flag = true;
		}
		return flag;
	}

	// 判断是否继续玩游戏。
	private boolean ifContinue() {
		Scanner scan = new Scanner(System.in);
		System.out.println("1.继续 2.退出");
		int input = scan.nextInt();
		boolean flag = false;
		if (input == 1) {
			flag = true;
		} else if (input == 2) {
			flag = false;
		} else {
			System.out.println("输入错误,请重新选择");
			this.ifContinue();
		}
		return flag;
	}

	
}
