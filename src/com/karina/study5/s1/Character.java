package com.karina.study5.s1;

public class Character {
	private int hp;
	private int damage;
	private int level;
	
	public final void getItem() { // 바뀔일없으므로 오버라이딩 금지
		System.out.println("아이템 줍기");
	}
	
//	public abstract void hit();
	
	public void hit() {
		
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	
}
