package com.students;

import java.util.Arrays;

public class Smallestnumber {

	public static void main(String[] args) {

		int a[] = { 9, 5, 6, 8, 3 };
		
//		int small = Integer.MAX_VALUE;
//
//		for (int i = 0; i < a.length; i++) {
//
//				if (a[i]<small) {
//					
//					small=a[i];
//				}
//		}
//		
//		System.out.println("The smallest number is " +small);
		
		Arrays.sort(a);
		
		System.out.println();
		

	}

}
