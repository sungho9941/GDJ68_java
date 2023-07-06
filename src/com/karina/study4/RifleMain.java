package com.karina.study4;

import java.util.Scanner;

public class RifleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Rifle rifle = new Rifle();
		
//		멤버~~들 사용법
//		1. 멤버변수 변수명.멤버변수명
//		2. 멤버메서드 변수명.멤버메서드명()
		
//		메서드 호출
//		rifle.shoot();
//		rifle.shoot2();
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 단발 2. 점사");
		int select = sc.nextInt();
		System.out.println("총알 수 입력");
		int b=sc.nextInt();
		if(select==1) {
			rifle.shoot(b);					
		}
		else {
			rifle.shoot2(1, "sss", null);
		}
		
		
	}

}
