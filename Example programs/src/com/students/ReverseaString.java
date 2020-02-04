package com.students;

import java.util.Scanner;

public class ReverseaString {
	
	public static void main(String[] args) {
		String reverse= " ";
		String name= "Sai";
		int length = name.length();
		
		for (int i = length-1; i >= 0; i--) {
			
			reverse=reverse+name.charAt(i);
		}
			System.out.println("The reverse of the string is" + reverse);
			
		
		
	}

}
