package com.students;

import java.awt.List;
import java.util.Collections;
import java.util.LinkedList;

public class Ascending {

	public static void main(String[] args) {

		int a[] = { 5, 6, 2, 4 };

		int temp;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
			System.out.println(" " + a[i]);

		}
		int add1 = a[0] + a[1];
		int add2 = a[2] + a[3];

		int result = add1 - add2;

		System.out.println("The result is...." + result);

	}

}
