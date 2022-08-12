package com.accolite.recursion;

public class NthFibonacciNumber {
	public static void main(String[] args) {
		int n=3;
		int fib=nThFibonacci(n);
		System.out.println(n);
		System.out.println(nThFibonacci(6));
	}

	private static int nThFibonacci(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return nThFibonacci(n-1)+nThFibonacci(n-2);
	}

}
