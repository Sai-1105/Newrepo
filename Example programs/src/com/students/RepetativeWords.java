package com.students;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RepetativeWords {
	
	public static void main(String[] args) {
		
		String i="I am am am rahul rahul";
		String[] Arr = i.split(" ");
		
		Set<String> s=new LinkedHashSet<String>();
		
		for(String x:Arr) {
			
			s.add(x);
		}
		
		Iterator<String> ite = s.iterator();
		
		
		while(ite.hasNext()) {
			
			System.out.print(ite.next() + " ");
		}
		
		

	}

}
