package com.karina.study4;

public class StudentView {
//	Student 정보를 출력
	
//	방법1	
//	public void view(String view, char view2) {
//	System.out.println(view + "    " + view2);
//}
	public void view(Student student) {
		System.out.println(student.name);
		System.out.println(student.gender);
		
	}
	
//	viewAll 메서드생성
//	모든 student들 정보 출력
//	단, 매개변수는 1개
	public void viewAll(Student [] student) {
		for(int i=0; i<student.length; i++) {
			System.out.println(student[i].name);
			System.out.println(student[i].gender);
			}
		
	}
	
}
