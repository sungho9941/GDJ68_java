package com.karina.study3;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] a = new int[2];
//		System.out.println(a.length + "a");
//		int [] b = new int [3];
//		System.out.println(b.length + "b");
//		a = b;
//		System.out.println(a.length + "a?");

		
		int [] nums = {1,2,3,4};
		System.out.println(nums.length);
		
		int [] copyNums = new int[nums.length+1];
//		copyNums = nums;
//		System.out.println(copyNums[2]);
		for(int i=0; i<nums.length; i++) {
			copyNums[i]=nums[i];
		}
		
		copyNums[nums.length]=8;
		
		
		
		nums=copyNums;
//		System.out.println(copyNums[3] + " d" + copyNums[4]);
//		System.out.println("nums 길이" + nums.length + nums[4]);
	
		
		
		copyNums = new int[nums.length-1];
		for(int i=0; i<copyNums.length; i++) {
			copyNums[i] = nums[i];
		}
		
		nums=copyNums;
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	
	}

}

