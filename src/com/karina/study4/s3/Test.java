package com.karina.study4.s3;

public class Test {
	int num1;
	double num2;
	
	public void hap(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
	public void hap(int n1, float n2) {
		System.out.println(n1+n2);
	}
	
	public void hap(int num1) {
		System.out.println(this.num1+num1);
	}
	
	public boolean same(Test t) {
//		num1과 다른 객체의 num1이 같고
//		num2와 다른 객체의 num2가 같으면
//		true 리턴, 아니면 false 리턴
		boolean result = false;
		if(this.num1 == t.num1 && this.num2 == t.num2) {
			result = true;
		}
		return result;
		
	}
	
	public void method1() {
		System.out.println(num1+num2);
		System.out.println(this);
	}
	
	public void method2() {
		
	}
}
