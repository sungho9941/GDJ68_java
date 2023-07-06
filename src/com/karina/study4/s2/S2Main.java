package com.karina.study4.s2;


public class S2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		StudentService ss = new StudentService();
//		
//		Student [] asd = ss.makeStudents();
//		for(int i=0; i<asd.length; i++) {
//			System.out.println(asd[i].name);
//			
//		}
//		
//		Student aa = ss.makeStudentOne();
//		System.out.println(aa.name);
//		System.out.println(aa.kor);
		
//		1. 프로그램 실행
//		2. 테스트 용도
		
//		객체 생성
//		Chef chef = new Chef();
//		Ramen [] ramen = chef.makeRamen(1);
//		
//		Ramen [] ramens = new Ramen[2];
//		chef.makeRamen2(ramens);
//		System.out.println(ramens[0].title);
//		
//		
//		int count = 2;
//		chef.makeRamen(count);
//		chef.makeKimbab();
		
		StudentController studentController = new StudentController();
		studentController.start();
	}

}
