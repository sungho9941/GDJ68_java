package com.karina.study4.s4;

public class Product {
	private String name;
	private String price;
	
	public Product(String name, String price) {
		this.name = name;
		this.price = price;
	}
	public void info() {
		System.out.println(this.name);
	}
}
