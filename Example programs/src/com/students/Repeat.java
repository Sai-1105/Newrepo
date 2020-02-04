package com.students;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repeat {
	
	public static void main(String[] args) {
		
		String s= "Welcome to Java to Java Java to Java";
		String[] x = s.split(" ");
		
		Map<String, Integer> m=new LinkedHashMap<>();
		
		for (String word : x) {
			
			if (m.containsKey(word)) {
				
				Integer in = m.get(word);
				m.put(word, in+1);
			} else {
				m.put(word,1);
			}
			
		}
		
		System.out.println(m);
		
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			
			if (entry.getValue()>1) {
				
				System.out.println(entry);
				
			}
			
		}
	}

}
