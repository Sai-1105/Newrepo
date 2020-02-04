package com.students;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word");
		String s = sc.nextLine();
		int l = s.length();
		for (int i = l-1; i >=0; i--) {
			reverse=reverse+s.charAt(i);
		}
		System.out.println("The reverse of the word is " +reverse);

	}

}
