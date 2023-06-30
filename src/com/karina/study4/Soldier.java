package com.karina.study4;

public class Soldier {
	String grade;
	int num;
//	Rifle rifle;
	int [] ar;
	
	public void attack(int count) {
		Rifle rifle = new Rifle();
		rifle.shoot(count);
	}
}
