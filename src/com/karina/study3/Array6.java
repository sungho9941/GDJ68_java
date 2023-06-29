package com.karina.study3;

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] ar = new double[3];
		ar[0]=1.2;
		ar[1]=(double)3;
		
		int [] nums1 = new int[3];
		int [] nums2 = new int[3];
		System.out.println(nums1==nums2);
		nums1=nums2;
		System.out.println(nums1==nums2);
		
		int [][]ars = new int[2][2];
		
		for(int i=0; i<ars.length; i++) {
			for(int j=0; j<ars[i].length; j++) {
				System.out.println(ars[i][j]);
			}
		}

	}

}
