package com.mru.assignment;

public class SumOfElements {

	public static void main(String[] args) {
		int[] arr = {123,456,789};
		System.out.print("Sum of digits: ");
		for(int num:arr) {
			System.out.print(sumOfDigits(num)+" ");
		}

	}

	public static int sumOfDigits(int num) {
		int sum = 0;
		while(num!=0) {
			sum += num % 10;
			num /= 10; 
		}
		return sum;
	}

}
