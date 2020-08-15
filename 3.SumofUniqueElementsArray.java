package com.app;

import java.util.Arrays;

public class SumofUniqueElementsArray {

	public static void main(String[] args) {
		int [] arrA = {1, 6, 4, 3, 2, 2, 3, 8, 1};
		//int [] arrA = {1, 1, 3, 2, 2, 3};
		Arrays.sort(arrA);

		int current = arrA[0];
		int sum = arrA[0];
		for (int i = 1; i <arrA.length ; i++) {
			if(current!=arrA[i]) {
				sum += arrA[i];
				current = arrA[i];
			}
		}
		System.out.println("Sum of all Unique elements : " +  sum);
	}

}


