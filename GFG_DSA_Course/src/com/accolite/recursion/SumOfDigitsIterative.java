package com.accolite.recursion;

public class SumOfDigitsIterative {

	public static void main(String[] args) {
		int n=253;
		int sum=sumOfDigits(n);
		System.out.println(sum);
		System.out.println(sumOfDigits(9987));
	}

	private static int sumOfDigits(int n) {
		int sum=0;
		while(n>0) {
			sum=sum+(n%10);
			n=n/10;
		}
		return sum;
	}
	
}

//theta(d)
//aux space: theta(1), no overhead