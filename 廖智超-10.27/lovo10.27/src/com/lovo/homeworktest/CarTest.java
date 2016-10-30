package com.lovo.homeworktest;

import com.lovo.homework2.Alto;
import com.lovo.homework2.Audi;
import com.lovo.homework2.RepairMan;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RepairMan repairMan = new RepairMan();
		Audi audi = new Audi();
		Alto alto = new Alto();
		repairMan.changeOil(audi);
		repairMan.debugEngine(audi);
		System.out.println("---------------------");
		repairMan.changeOil(alto);
		repairMan.debugEngine(alto);
	}

}
