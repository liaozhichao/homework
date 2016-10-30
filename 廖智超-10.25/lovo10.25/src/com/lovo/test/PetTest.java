package com.lovo.test;

import com.lovo.bean.Cat;
import com.lovo.bean.Dog;

public class PetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("旺财",5,"贾宝玉");
		Cat cat = new Cat("小白",4,"林黛玉");
		
		dog.eat();
		dog.play();
		System.out.println();
		cat.eat();
		cat.play();
	}

}
