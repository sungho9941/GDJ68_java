package com.karina.study5.s1;

public class Magician extends Character{
	private int mp;

	public Magician() {
		super();//부모의 생성자 호출
	}
	
	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

//	overriding : 수정
//	상속받은 메서드의 내용을 자기에 맞게 재정의
//	상속받은 메서드의 선언부는 동일하게 작성
	public void hit() {
		System.out.println("파이어볼");
	}
}
