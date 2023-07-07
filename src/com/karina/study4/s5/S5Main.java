package com.karina.study4.s5;

public class S5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StaticTest st = new StaticTest();
//		st.instancenum=50;
//		클래스명.변수명
//		StaticTest.staticNum=20;
//		
//		StaticTest.staticMethod();
		
		MyCar.company="AUDI";
		
		MyCar myCar = new MyCar();
		myCar.brand="A7";
		
		System.out.println(MyCar.company);
		System.out.println(myCar.brand);
		
		MyCar myCar2 = new MyCar();
		myCar2.brand="S7";
		
		System.out.println(MyCar.company);
		System.out.println(myCar2.brand);
	}

}
