package com.students;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Reps {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String a = sc.nextLine();
		
		Map<String, Integer> m=new LinkedHashMap<String, Integer>();
		
		String[] allwords = a.split(" ");
		
		for (String word : allwords) {
			
			if (m.containsKey(word)) {
				
				Integer in = m.get(word);
				m.put(word, in+1);
			}else {
				m.put(word, 1);
			}
			
		}System.out.println(m);
	}

}
