package com.students;

import java.util.Scanner;

public class Amstrongs {
	
	public static void main(String[] args) {
		for (int n=1;n<=1000;n++) {
		
		int a , rem=0,sum=0;
		a=n;
		
		while (a>0) {
			
			rem=a%10;
			sum=sum+(rem*rem*rem);
			a=a/10;
		}
		
		if (sum==n) {
			System.out.println(n);
		}
	}
	
	}
}
