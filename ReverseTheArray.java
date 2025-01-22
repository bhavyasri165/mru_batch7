package com.mru.assignment;

public class ReverseTheArray {

	public static void main(String[] args) {
		   
		int[] arr = {101,102,103,104,105};
		for(int i = 0;i<arr.length;i++) {
			arr[i] = reverseNumber(arr[i]);
		}
		System.out.print("Reversed array: ");
		for(int num : arr) {
			System.out.print(num+" ");
		}
	}

	public static int reverseNumber(int num) {
		int reversed = 0;
		while(num!=0) {
			int digit = num% 10;
			reversed = reversed*10+digit;
			num/=10;
		}
		return reversed;
	}
}
	       
