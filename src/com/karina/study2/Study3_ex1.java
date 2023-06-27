package com.karina.study2;

import java.util.Scanner;

public class Study3_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		국어, 영어, 수학 입력
//		총점 평균 계산(int)
//		90 a 80 b 70 c 60 d 
//		switch
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		System.out.println("입력");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		int total = (kor+eng+math)/3;

		switch(total/10){
		case 10:
		case 9:
			System.out.println(total);
			System.out.println(total/10);
			System.out.println("a");
			break;
			
		case 8:
			System.out.println(total);
			System.out.println(total/10);
			System.out.println("b");
			break;
		
		case 7:
			System.out.println(total);
			System.out.println(total/10);
			System.out.println("c");
			break;
			
		case 6:
			System.out.println(total);
			System.out.println(total/10);
			System.out.println("d");
			break;
			
		default:
			System.out.println(total);
			System.out.println(total/10);
			System.out.println("f");
			break;
		}
		
		
		
	}

}
