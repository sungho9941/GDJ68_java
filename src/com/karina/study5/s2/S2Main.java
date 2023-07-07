package com.karina.study5.s2;

public class S2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer = new Computer();
		computer.setProduct("SAMSUNG");
		computer.setName("갤럭시북");
		computer.setCpu("i9");
		computer.setColor("WHITE");
		computer.setPrice(2000000);
		computer.setPoint(20);
		
		Tv tv = new Tv();
		tv.setProduct("LG");
		tv.setName("좋은tv");
		tv.setInch(100);
		tv.setColor("BLACK");
		tv.setPrice(5000000);
		tv.setPoint(50);
		
		Phone phone = new Phone();
		
		phone.setProduct("APPLE");
		phone.setName("IPHONE15");
		phone.setOs("IOS");
		phone.setColor("PINK");
		phone.setPrice(1800000);
		phone.setPoint(15);
		
		Customer winter = new Customer();
		winter.buy(phone);
		
		Himart [] w = new Himart[2];
		w[0] = tv;
		w[1] = phone;
		
		winter.buy2(w);
			
	}

}
