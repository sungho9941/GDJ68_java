package com.karina.study4.s5;

public class StaticTest {
	public int instancenum;
	
	public static int staticNum;
	
	public void instanceMethod() {
		StaticTest.staticNum=50;
		instancenum=20;
		System.out.println("멤버메서드");
	}
	
	public static void staticMethod() {
		StaticTest.staticNum=20;
		
		System.out.println("클래스메서드");
	}
}
