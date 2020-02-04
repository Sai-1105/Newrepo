package com.students;

import java.util.Scanner;

public class Evenorodd {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a= sc.nextInt();
		
		if (a%2==0) {
			
			System.out.println("The given number is even number");
		}else {
			
			System.out.println("The given number is odd number");
		}
	}
	

}
