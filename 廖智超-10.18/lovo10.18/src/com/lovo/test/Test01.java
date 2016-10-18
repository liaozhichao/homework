package com.lovo.test;

//有1000瓶药水只有一瓶有毒，假设耗子吃了药水以后24小时才有反应。科学家也只有24小时。
//最少需要几只耗子。
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 思路：耗子的状态只有两种，死或生。耗子状态的排列组合。
		System.out.println(1 << 10);
	}
}
