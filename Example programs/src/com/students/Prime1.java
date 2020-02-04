package com.students;

import java.util.Scanner;

public class Prime1 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		int n = input.nextInt();
		int count = 0;
		for (int i = 2; i <= n/2; i++) {
			if (n % i == 0) {	
			count = 1;
			}
			if (count==0) {	
				System.out.println("It is a prime number");	
			}else {
				System.out.println("It is not a prime number");
			}
		}
		
			}
	}


