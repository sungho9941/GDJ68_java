package com.karina.study2;

import java.util.Random;
import java.util.Scanner;

public class Study5_while_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int skillCount=3;
		int hp=40;
		int monsterHp=60;
		int monsterPower=40;
		
//		유저정보 : hp, 몬스터 정보 : hp
//		1. 평타 2. 스킬 3. HP회복 4. 도망
//		평타 : 0~10 미만의 공격이 몬스터에게 적용
//		스킬 : 0~30 미만의 공격이 몬스터에게 적용(최대 3번까지만)
//		회복 : 회복량 0~40까지
//		도망 : 50%확률로 성공, 실패
		boolean flag = true;
		while(flag) {
			System.out.println("1. 평타 2. 스킬 3. HP회복 4. 도망");
			int select = sc.nextInt();
			
			if(select==1) {
				//평타
				select=random.nextInt(11);
				monsterHp=monsterHp-select;
				System.out.println("몹에게"+select+"피해를 주었습니다");
				if(monsterHp<1) {
					System.out.println("몹이 죽었어요");
					break;
				}
			}
			else if(select==2) {
				//스킬
				if(skillCount>0) {
				select=random.nextInt(31);
				monsterHp=monsterHp-select;
				System.out.println("몹에게"+select+"피해를 주었습니다");
				if(monsterHp<1) {
					System.out.println("몹이 죽었어요");
					break;
					}
				skillCount--;
				}else {
					System.out.println("마나가 부족합니다");
				}
			}
			else if(select==3) {
				//회복
				select = random.nextInt(41);
				hp=hp+select;
				if(hp>40) {
					hp=40;
				}
				System.out.println("Hp를 회복했어요");
			} else {
				//도망
				select = random.nextInt(2);
				if(select==0) {
					System.out.println("도망 성공");
					break;
				}
				else {
					System.out.println("도망 실패");
				}
			}
			//유저의 끝
			select=random.nextInt(41);
			System.out.println("유저에게 " + select + "피해를 주었습니다");
			if(hp<1) {
				System.out.println("You Die");
				break;
			}
			
		}//while 끝
	}
	
	

}
