package com.lovo.test;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Student stu = new Student();// 产生一个student对象。
		// stu.name = "张三";
		// stu.age = 18;
		// stu.gender = true;
		// System.out.println(stu.name);
		//
		// stu.study();
		//
		// Student stu0 = new Student();// 产生一个student对象。
		// stu0.name = "李四";
		// Student stu1 = new Student();// 产生一个student对象。
		// stu1.name = "王五";
		// Student stu2 = new Student();// 产生一个student对象。
		// stu2.name = "周扒皮";

		Pet pet = new Pet();
		pet.name = "小白";
		pet.age = 3;
		pet.gender = true;
		pet.color = "白色";
		pet.type = "中华田园犬";
		System.out.println(pet.name + "的颜色是" + pet.color + "，种类是" + pet.type);
		pet.eat();
		pet.sleep();
		
		System.out.println();
		
		Pet pet2 = new Pet();
		pet2.name = "小花";
		pet2.age = 3;
		pet2.gender = true;
		pet2.color = "花色";
		pet2.type = "波斯猫";
		System.out.println(pet2.name + "的颜色是" + pet2.color + "，种类是" + pet2.type);
		pet2.eat();
		pet2.sleep();
	}

}
