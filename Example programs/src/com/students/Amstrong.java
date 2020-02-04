 package com.students;

import java.util.Scanner;

public class Amstrong {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		int a, sum=0,rem=0;
		a=n;
		
		while(a!=0) {
			
			rem=a%10;
			sum=sum+(rem*rem*rem);
			a=a/10;
		}
if (sum==n) {
	System.out.println("The given number is Amstrong number");
}

else {
	System.out.println("The given number is not an Amstrong number");
}
	}
}
