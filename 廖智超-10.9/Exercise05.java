package com.liao.home;
/**
 * һ���ܷ���100�׸߿գ���100�׸߶��������䣬ÿ����غ�����ԭ�߶ȵ�һ�롣�����ڵ�10�����ʱ�����������ס�
 * ��10�η������
 * @author spring
 *
 */
public class Exercise05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=100.0;
		double height1=100.0;
		for(int i=1;i<=9;i++){
			sum+=(height1/2)*2;
			height1/=2;
		}
		double height2=height1/2;
		System.out.println(String.format("С�򾭹�%.2f��,��10�η���%.2f��",sum,height2));
	}

}
