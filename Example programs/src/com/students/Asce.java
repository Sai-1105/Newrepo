package com.students;

public class Asce {

	public static void main(String[] args) {

		int a[] = { 23, 48, 74, 87, 99, 24 };
		System.out.println("The sorted values are  ");

		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}System.out.println( +a[i]);

		}
		
		System.out.println("The largest number is" +a[5]);
		System.out.println("The smallest number is" +a[0]);
	}

}
