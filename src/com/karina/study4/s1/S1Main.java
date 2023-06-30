package com.karina.study4.s1;


public class S1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Hap hap = new Hap();
		int sum = hap.h1(10, 20);
		System.out.println(sum*5);
		
		
		
		Hap hap2 = new Hap();
		boolean check = hap2.h2(2);
		System.out.println(check);
		
		
		
//		입력받은 매개변수만큼 배열갯수 만들기
		Hap hap3 = new Hap();
		int [] arr = hap3.h3(7);
		System.out.println(arr.length);

	}

}
