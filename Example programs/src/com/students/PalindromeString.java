package com.students;

import java.util.Scanner;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		String rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String name = sc.nextLine();
		
		
		int length = name.length();
		
		for (int i =length-1; i >=0; i--) {
			
			rev=rev+name.charAt(i);
			
		}
		
		if (name.equals(rev)) {
			
			System.out.println("The give word is a PALINDROME");
			
		}else {
			
			System.out.println("The given word is not a PALINDROE");
		}
		
	}

}
