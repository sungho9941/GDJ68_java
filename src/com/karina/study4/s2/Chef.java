package com.karina.study4.s2;

public class Chef {
	String name;

	
	public void makeRamen2(Ramen [] ramens) {
		for(int i=0; i<ramens.length; i++) {
			Ramen ramen = new Ramen();
			ramen.title = "진라면";
			ramen.price = 3000;
			ramens[i] = ramen;
			
		}
	}
	public Ramen [] makeRamen(int count) {
//		Ramen ramen = new Ramen();
//		Ramen ramen2 = new Ramen();
//		ramen2 = new Ramen();
//		객체 수 : 3, 사용가능한 객체 : 2
		Ramen [] ramens = new Ramen[count];
		for(int i=0; i<count; i++) {
			Ramen ramen = new Ramen();
			ramen.title = "진라면";
			ramen.price = 3000;
			
			ramens[i] = ramen;			
		}
		
		return ramens;
	}
	
	public void makeKimbab() {
		
	}
}
