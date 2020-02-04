package com.students;

import java.util.Scanner;

public class Multiply {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the table: ");
		int n = sc.nextInt();
		System.out.print("table upto: ");
		int j = sc.nextInt();
		
		for (int i = 1; i < j; i++) {
			
			int c=n*i;
			System.out.println(n+"*"+i+"=" +c);
			
		}
		
	}

}
