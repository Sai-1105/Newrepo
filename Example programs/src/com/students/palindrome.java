 package com.students;

import java.util.Scanner;

public class palindrome {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		
		int rem=0,rev=0;
		int a=n;
		
		while (a!=0) {
			rem= a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		
		if (rev==n) {
		
		System.out.println("The given number is palindrome number ");
		
		} else {
			System.out.println("The given number not is palindrome number ");

		}
		
		}
}
