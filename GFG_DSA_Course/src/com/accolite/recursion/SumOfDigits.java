package com.accolite.recursion;

public class SumOfDigits {
	public static void main(String[] args) {
		int n=253;
		int sum=sumOfDigits(n);
		System.out.println(sum);
		System.out.println(sumOfDigits(9987));
	}

	private static int sumOfDigits(int n) {
		if(n==0)
			return 0;
		return (n%10)+sumOfDigits(n/10);
	}

}

//theta(d)
//aux space- theta(d)