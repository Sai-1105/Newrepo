package com.students;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Reperrr {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String  s= sc.nextLine();
		String[] x = s.split(" ");
		
		Map<String, Integer> m=new LinkedHashMap<String, Integer>();
		
		for (String word : x) {
			
			if (m.containsKey(word)) {
				
				Integer in = m.get(word);
					m.put(word, in+1);
				
			}else {
				m.put(word, 1);
			}
		}System.out.println(m);
	}

}
