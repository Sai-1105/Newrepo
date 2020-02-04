package com.students;

public class sumofeven {
	
public static void main(String[] args) {
		
		int count=0;
		for (int i = 1; i <=5; i++) {
			
			if (i%2==0) {
				
				count=count+i;
				
			}
			
		}
		System.out.println("The sum of even number is " +count);
			
		}
}


