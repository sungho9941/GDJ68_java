package com.karina.study4;

public class StudyMain {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");

//		Card card = new Card();
//		Card card2 = new Card();
//		
//
//		System.out.println(card.cvc);
//		System.out.println(card.name);
//	
		Student s1 = new Student();
		s1.name = "winter";
		s1.gender = 'F';
		
		Student s2 = new Student();
		s2.name = "iu";
		s2.gender = 'F';
//		Student [] students = new Student[3];
//		students[0] = s1;
//		students[1] = s2;
//		
////		System.out.println(students[2].name);
//		
//		for(int i=0; i<students.length; i++) {
//			System.out.println(students[i].name);
//			System.out.println(students[i].id);
//			
//		}
		
		StudentView sv = new StudentView();

		//방법1
//		sv.view(s1.name, s1.gender);
		sv.view(s1);
		
		//모든 학생정보 출력을 위한 배열 생성
		Student [] students = new Student[2];
		students[0] = s1;
		students[1] = s2;
		
		sv.viewAll(students);
		
//		s2=s1;
//		
//		System.out.println(s2.name);
		
		System.out.println("프로그램 종료");
	
	
	}
}
