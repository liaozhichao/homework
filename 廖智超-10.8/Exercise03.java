package com.liao.home;
/**
 * 
 * @author spring
 *猴子第一天吃了若干个桃，当即吃了一半，不过瘾，又多吃了一个，第二天早上又将剩下的桃子吃到一半，又多吃了一个。
 *以后每天早上都吃了前天剩下的一半零一个。到第十天早上想再吃时，见只剩下一个桃子了，求第一天共摘了多少。
 */
public class Exercise03 {
	public static void main(String[] args) {
		int peach=1;
		for(int i=1;i<10;i++)
		{
			peach=(peach+1)*2;
		}
		System.out.println("一个摘了"+peach+"个桃子");
	}
}
