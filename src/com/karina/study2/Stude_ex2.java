package com.karina.study2;

import java.util.Scanner;

public class Stude_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//회원가입시 입력한 data
		int id=1234;
		int pw=5678;
		
		//로그인 과정
//		id pw 입력받아서 로그인
//		로그인 성공, 실패
		
//		로그인 처리 후 작성
//		성공한 사람만 실행
//		1. 정규직 2. 계약직
//		급여입력
//		정규직 : 건보료 3%,국민연금 2%, 고용 1% 산재보험 1%
//		계약직 : 3.3%
//		실급여 출력
		System.out.println("아이디 입력");
		int yid=sc.nextInt();
		System.out.println("비밀번호 입력");
		int ypw=sc.nextInt();
		int contract = 0;
		double sal = 0;
		if(id==yid && pw==ypw) {
			System.out.println(yid + "" + ypw);
			System.out.println("로그인성공");
			
			System.out.println("1. 정규직 2. 계약직 숫자입력");
			contract=sc.nextInt();
			System.out.println("급여 입력");
			sal=sc.nextInt();
			switch(contract) {
			case 1:
				System.out.println("정규직이고" + "실급여 : " + (int)(sal*0.93));
				break;
			case 2:
				System.out.println("비정규직이고" + "실급여 : " + (int)(sal*0.967));
				break;
			default:
				System.out.println("잘못누름");
			}
			
		}
		else {
			System.out.println(yid + "" + ypw);
			System.out.println("로그인실패");
		}

	
	}

}