package com.karina.study4.s2;

import java.util.Scanner;

public class StudentService {
	public Student [] makeStudents(int count) {
//		학생수 입력
//		학생수만큼 학생들이 만들어짐
//		이름, 번호, 국어, 영어, 수학 점수 입력
//		총점, 평균 계산
//		학생들 리턴
//		1. 학생 배열을 생성
//		2. 학생수만큼 반복문 실행
//		3. 반복문 내에서 이름, 번호, 국어, 영어, 수학 입력 총점 평균
//		4. 해당 학생을 배열에 대입

		Student [] student = new Student[count];
		
		for(int i=0; i<student.length; i++) {
			Scanner sc = new Scanner(System.in);
			
			Student student1 = new Student();
			
			System.out.print(i + "번째 학생 이름 : ");
			student1.name = sc.next();
			
			System.out.print(i + "번째 학생 번호 : ");
			student1.num = sc.nextInt();
			
			System.out.print(i + "번째 학생 국어 점수 : ");
			student1.kor = sc.nextInt();
			
			System.out.print(i + "번째 학생 영어 점수 : ");
			student1.eng = sc.nextInt();
			
			System.out.print(i + "번째 학생 수학 점수 : ");
			student1.math = sc.nextInt();
			
			student1.total = student1.kor + student1.eng + student1.math;
			
			student[i] = student1;
		}		
		
		return student;

		
		
	
	}
}
