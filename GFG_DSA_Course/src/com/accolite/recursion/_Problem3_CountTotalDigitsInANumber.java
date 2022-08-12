package com.accolite.recursion;

public class _Problem3_CountTotalDigitsInANumber {
	public static void main(String[] args) {
		int n=99999;
		int count=countDigits(n);
		System.out.println(count);
	}

	private static int countDigits(int n) {
		if(n<10)
			return 1;
		return 1+countDigits(n/10);
	}

}
