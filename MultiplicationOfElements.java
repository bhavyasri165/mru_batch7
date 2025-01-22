package com.mru.assignment;

public class MultiplicationOfElements {

	public static void main(String[] args) {
		int[] arr = {12,34,56};
		System.out.print("Multiplication of digits: ");
		for(int num : arr) {
			System.out.print(multiplyDigits(num)+" ");
		}
	}

	public static int multiplyDigits(int num) {
		int product = 1;
		while(num != 0) {
			int digit = num % 10;
			product *= digit;
			num /= 10;
		}
		
		return product;
	}

}
