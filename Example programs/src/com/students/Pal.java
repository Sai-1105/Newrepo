package com.students;

public class Pal {
	
	public static void main(String[] args) {
		
		for ( int n=1; n<=100; n++) {
			
		
		int a, rem=0,rev=0;
		a= n ;
	
		
		while (a!=0) {
			
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		if (rev==n) {
			System.out.println(n);
		}
		}
	}

}
