package com.karina.study4.s2;

import java.util.Scanner;

public class StudentController {
	public void start() {
//		1. 학생정보 생성 -- makeStudents 호출 
//		2. 학생정보 출력 -- StudentView에서 출력
//		3. 프로그램 종료
		Scanner sc = new Scanner(System.in);
		StudentService studentService = new StudentService();
		Student [] students = null;
		
		StudentView studentView = new StudentView();
		while(true){
		System.out.println("1. 학생정보생성");
		System.out.println("2. 학생정보출력");
		System.out.println("3. 학생정보검색");
		System.out.println("4. 프로그램종료");
		
		int select = sc.nextInt();
		
		if(select==1) {
			students = studentService.makeStudents();
		}
		else if(select==2) {
			studentView.view(students);
		}
		else if(select==3) {
			Student student = studentService.findbyNum(students);
			studentView.view(student);
		}
		else {
			System.out.println("프로그램종료");
			break;
		}
		
		}
	}
}