package com.lovo.homework;

import java.sql.Date;
import java.util.Scanner;

public class Police {
	private String id;
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 交警开出罚单,记录车，车主，违规信息。
	public Ticket giveTicket() {
		Scanner scanner = new Scanner(System.in);
		// 创建车对象
		Car car = new Car();
		// 创建车主对象
		Driver driver = new Driver();
		// 通过控制台，输入扣分，罚款，和处罚原因
		System.out.println("请输入处罚原因");
		String reason = scanner.nextLine();

		System.out.println("请输入罚款金额");
		double fakuan = scanner.nextDouble();

		System.out.println("请输入扣分情况");
		int koufen = scanner.nextInt();

		System.out.println("请输入车型:");
		String carName = scanner.next();

		System.out.println("请输入车牌号：");
		String carNumber = scanner.next();

		System.out.println("请输入颜色:");
		String color = scanner.nextLine();
		color = scanner.nextLine();
		
		System.out.println("请输入车主姓名");
		String driverName = scanner.nextLine();

		System.out.println("请输入车主年龄");
		int age = scanner.nextInt();

		System.out.println("请输入车主驾驶证号");
		String driverId = scanner.nextLine();
		driverId = scanner.nextLine();
		
		System.out.println("请输入车主性别");
		String gender = scanner.nextLine();
		
		car.setCarName(carName);
		car.setCarNumber(carNumber);
		car.setColor(color);
		// 初始化
		driver.setAge(age);
		driver.setCar(car);
		driver.setDriverId(driverId);
		driver.setDriverName(driverName);
		driver.setGender(gender);
		driver.setScore(driver.getScore() - koufen);

		// new一个罚单对象
		Ticket ticket = new Ticket();
		ticket.setCar(car);
		ticket.setDriver(driver);
		ticket.setPolice(this);
		ticket.setDate("2016-10-19");
		ticket.setFakuan(fakuan);
		ticket.setKoufen(koufen);
		ticket.setReason(reason);
		ticket.ticketNumber=Ticket.ticketNumber+1;
		scanner.close();
		return ticket;
	}
}
