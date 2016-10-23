package com.lovo.bean;

import java.util.Scanner;

public class Atm {
	public final int MAX_CASH = 100000;// 最大现金

	private UserBean user;// 用户

	private int cash;// ATM中的现金

	private String bankName;// 所属银行

	public Atm() {
		// 初始化数据
		this.cash = 50000;
		this.bankName = "ICBC爱存不存银行";
		this.user = new UserBean("001", "123", 520);
	}

	// 运行方法--流程控制。
	public void run() {
		this.welcome();
		boolean flag = this.login();
		if (flag) {
			while (true) {
				int choice = this.chooseMenue();
				switch (choice) {
				case 1:
					this.query();
					break;
				case 2:
					this.getMoney();
					break;
				case 3:
					this.storeMoney();
					break;
				case 4:
					this.changePwd();
					break;
				case 5:
					this.exit();
					break;
				default:
					System.out.println("没有该选项，请重新选择");
					break;
				}
			}
		} else {
			this.exit();
		}

	}

	// 欢迎
	private void welcome() {
		System.out.println("********************************");
		System.out.println("************欢迎来到*************");
		System.out.println("**********" + this.bankName + "*******");
		System.out.println("********************************");
		System.out.println("**********version1.0************");
	}

	// 登录
	private boolean login() {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("请输入卡号：");
			String inputCardNum = scan.nextLine();
			System.out.println("请输入密码：");
			String inputPwd = scan.nextLine();
			if (inputCardNum.equals(this.user.getCardNum()) && inputPwd.equals(this.user.getPassword())) {
				System.out.println("登陆成功!");
				return true;
			} else {
				System.out.println("卡号或密码有误,请查证。");
			}
		}
		System.out.println("三次机会使用完毕，您的卡被没收，请到柜台处理");
		return false;
	}

	// 菜单选择
	private int chooseMenue() {
		Scanner scan = new Scanner(System.in);
		System.out.println("请选择你要执行的操作");
		System.out.println("1.查询2.取款3.存款4.修改密码5.退出");
		int choice = scan.nextInt();
		return choice;
	}

	// 查询余额
	private void query() {
		System.out.println("您当前余额为" + this.user.getAccount());
	}

	// 取钱
	private void getMoney() {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入您要取钱的数目：");
		int getMoney = scan.nextInt();
		if (getMoney > this.cash) {
			System.out.println("您要取出的数目大于ATM机存款，请重新选择：");
			return;
		} else if (getMoney > user.getAccount()) {
			System.out.println("您要取出的数目大于您的账户余额，请重新选择");
			return;
		} else if (getMoney <= 0) {
			System.out.println("您要取出的数目必须大于0，请重新选择");
			return;
		} else if (getMoney % 100 != 0) {
			System.out.println("您要取出的数目必须是100的整数倍，请重新选择");
			return;
		} else {
			user.setAccount(user.getAccount() - getMoney);
			this.cash -= getMoney;
			System.out.println("取款成功,请收好你的钞票！");
			return;
		}
	}

	// 存钱
	private void storeMoney() {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入您要存钱的数目：");
		int storeMoney = scan.nextInt();
		if (storeMoney <= 0) {
			System.out.println("存钱数目必须大于0，请重新选择");
			return;
		} else if (storeMoney % 100 != 0) {
			System.out.println("存钱的数目必须是100的整数倍，请重新选择");
			return;
		} else if ((storeMoney + this.cash) > this.MAX_CASH) {
			System.out.println("ATM机存储金额超出上限，请重新选择");
			return;
		} else {
			this.cash +=storeMoney;
			user.setAccount(storeMoney + user.getAccount());
			System.out.println("存款成功");
			return;
		}                                                                                                                                                                                                                                                                                                                                                                  
	}

	
	// 修改密码
	private void changePwd() {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入原密码");
		String oldPwd = scan.nextLine();
		System.out.println("请输入您的新密码");
		String pwd1 = scan.nextLine();
		System.out.println("请确认您的新密码");
		String pwd2 = scan.nextLine();
		if(!oldPwd.equals(this.user.getPassword())){
			System.out.println("原密码输入不正确");
			return;
		}
		else if (pwd1.equals(pwd2)) {
			System.out.println("密码修改成功");
			user.setPassword(pwd1);
			return;
		} else {
			System.out.println("两次输入的密码不相同，请重新选择：");
			return;
		}
	}

	// 退出
	private void exit() {
		System.out.println("谢谢您的光顾，请下次再来.");
		System.exit(0);// 关闭虚拟机
	}
}
