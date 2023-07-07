package com.karina.study5.s1;

public class S1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worrier worrier = new Worrier();
		worrier.getItem();
		Magician magician = new Magician();
		
//		worrier.axe.name
		Character character = magician;
		character = worrier;
		
		magician.setMp(20);
		magician=(Magician)character; // 형변환해줘야 부모가 접근가능
		magician.setMp(0);
		
		
		Character [] w = new Character[2];
		w[0]=worrier;
		w[1]=magician;
		
		
		worrier = (Worrier)w[0];
		magician = (Magician)w[1];
		
		Character ch1 = new Character();
		magician = (Magician)ch1;
		magician.setMp(20);
		
	}

}
