package com.lovo.test;

import java.util.Scanner;

import com.lovo.bean.Television;

public class WatchTelevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入频道：");
		int channel = scanner.nextInt();
		System.out.println("请输入音量：");
		int volume = scanner.nextInt();
		Television t = new Television(channel,volume);
		System.out.println("频道是"+t.getChannel()+",音量是"+t.getVolume());
	}

}
