package com.lovo.test;

//数组长度动态可变
public class SuperArray {

	private int[] array = new int[10];
	private int index = 0;

	// 添加元素
	public void add(int value) {
		// if(放满了，扩容)
		if (array.length == index) {
			int[] newArray = new int[this.array.length + 10];
			System.arraycopy(this.array, 0, newArray, 0, this.array.length);
			this.array = newArray;
		}
		this.array[index] = value;
		this.index++;
	}

	// 获取某个位置的元素
	public int get(int index) {
		if (index >= 0 && index < this.index) {
			return this.array[index];
		}
		// 抛出异常。符合业务逻辑。
		throw new ArrayIndexOutOfBoundsException(index);
	}

	// 移除元素,要实现自动缩容
	public void remove(int index) {
		if (index >= 0 && index < this.index) {
			System.arraycopy(this.array, index + 1, this.array, index, this.index - index - 1);
			this.index--;
			if (this.capibility() - this.size() >= 10&&this.array.length>20) {
				int[] newArray = new int[this.array.length - 10];
				System.arraycopy(this.array, 0, newArray, 0, this.capibility());
				this.array = newArray;
			}
			return;
		}
	}

	public void set(int indthex,int value){
		if(index>=0&&index<this.index){
			this.array[index] = value;
		}
	}
	// 得到放置了多少个元素
	public int size() {
		return this.index;
	}

	// 得到数组容量是多少
	public int capibility() {
		return this.array.length;
	}
}
