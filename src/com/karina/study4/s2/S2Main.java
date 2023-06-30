package com.karina.study4.s2;


public class S2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentService ss = new StudentService();
		
		Student [] student= ss.makeStudents(2);
		
		for(int i=0; i<student.length; i++) {
			System.out.println(student[i].name);
			System.out.println(student[i].num);
			System.out.println(student[i].kor);
			System.out.println(student[i].eng);
			System.out.println(student[i].math);
			System.out.println(student[i].total);
			System.out.println(student[i].total / 3);
			
			
			

			
			
			
		}
	}

}
