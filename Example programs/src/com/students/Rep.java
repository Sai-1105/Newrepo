package com.students;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Rep {
	
public static void main(String[] args) {
	
	String s="Welcome to to Java to Java to";
	String[] x = s.split(s);
	
	Map<String, Integer> m=new LinkedHashMap<>();
	
	for (String word : x) {
		
		if (m.containsKey(word)) {
			
			Integer  i = m.get(word);
			m.put(word, i+1);
			
		} else {
			
			m.put(word, 1);
		}
		
		System.out.println(m);
		
	}
	
	Set<Entry<String, Integer>> entrySet = m.entrySet();
	for (Entry<String, Integer> entry : entrySet) {
		if(entry.getValue()>1) {
			System.out.println(entry);
		}
	}
}
}
