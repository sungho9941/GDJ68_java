package com.karina.study3;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		입력받은 숫자번째 배열 삭제
		
		Scanner sc = new Scanner(System.in);
		int [] nums = {1,2,3,4,5};
		System.out.println("지우려고 하는 idx번호를 입력하세요");
		int idx = sc.nextInt();
		
		
		int [] copynums = new int[nums.length-1];
		
		
		int index=0;
		for(int i=0; i<nums.length; i++) {
			if(idx==i) {
				continue;
			}
			copynums[index]=nums[i];
			index++;
		}
		
		nums=copynums;
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		
//		int [] copynums = new int[5];
//		for(int i=0; i<nums.length; i++) {
//			copynums[i] = nums[i];		
//		}
//		
//		
//		for(int i=0; i<copynums.length; i++) {
//			if(idx==copynums[i]) {
//				System.out.println("누른번호"+copynums[i]);
//			}		
//		}
		
		
		
		
		
	}

}
