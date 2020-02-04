package com.students;

import java.util.LinkedHashMap;
import java.util.Map;

public class Repss {

	public static void main(String[] args) {

		String s = "Hello Hello Hi Hi";

		Map<String, Integer> m = new LinkedHashMap<String, Integer>();

		String[] allwords = s.split(" ");
		for (String word : allwords) {

			if (m.containsKey(word)) {

				Integer in = m.get(word);
				m.put(word, in+1);

			}else {
				m.put(word, 1);
			}
			
			
		}
		System.out.println(m); 

	}

}
