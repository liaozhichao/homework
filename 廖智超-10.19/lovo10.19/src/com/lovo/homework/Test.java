package com.lovo.homework;

import java.util.Date;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//创建交警对象
		Police police = new Police();
		police.setId("9527");
		police.setName("张三");		
		//调用交警的开罚单行为,返回值为罚单类型
		System.out.println("-----------------------请输入罚单信息-----------------------");
		Ticket ticket = police.giveTicket();
		System.out.println("-----------------------罚单信息----------------------------");
		System.out.println("罚单编号"+ticket.ticketNumber);
		System.out.println("违规车辆信息：");
		System.out.println("车型："+ticket.getCar().getCarName()+" 颜色："+
		ticket.getCar().getColor()+" 车牌号:"+ticket.getCar().getCarNumber());
		System.out.println("车主信息：");
		System.out.println("姓名:"+ticket.getDriver().getDriverName()+" 年龄:"+ticket.getDriver().getAge()+" 性别:"+ticket.getDriver().getGender()+" 驾驶证号:"+ticket.getDriver().getDriverId());
		System.out.println("违规信息：");
		System.out.println("处罚原因:"+ticket.getReason()+" 罚款:"+ticket.getFakuan()+" 扣分:"+ticket.getKoufen());
		System.out.println("执法交警:"+ticket.getPolice().getName());
		System.out.println("日期："+ticket.getDate());
	}

}
