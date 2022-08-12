package com.accolite.recursion;

public class _Problem2_SumOfDigitsOfANumber {
	public static void main(String[] args) {
		int n=99999;
		int sum=sumOfDigits(n);
		System.out.println(sum);
	}

	private static int sumOfDigits(int n) {
		if(n==0)
			return 0;
		return (n%10)+ sumOfDigits(n/10);
	}
}
