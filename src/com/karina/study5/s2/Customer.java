package com.karina.study5.s2;

public class Customer {
	private int money;
	private int point;
	
	public Customer() {
		this.money=10000000;
		this.point=50;
	}
	
	public void buy(Himart himart) {
		this.money = money - himart.getPrice();
		this.point = point + himart.getPoint();
		
		System.out.println(this.money);
		System.out.println(this.point);
	}
	
	public void buy2(Himart [] himart) {
		
		for(int i=0; i<himart.length; i++) {
			this.money = money - himart[i].getPrice();
			this.point = point + himart[i].getPoint();
			
		}
		System.out.println("현재잔고" + this.money);
		System.out.println("포인트"+this.point);		
	}
}

