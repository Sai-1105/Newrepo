package com.students;

import java.util.Scanner;

public class Scannerstringreverse {
	
	public static void main(String[] args) {
		
		//String name="Sai";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String name = sc.nextLine();
		String rev=" ";
		
		int length = name.length();
		
		for (int i =length-1; i >=0; i--) {
			
			rev=rev+name.charAt(i);
			
		}
		System.out.println("The reverse of the string is" +rev);
		
	}

}
