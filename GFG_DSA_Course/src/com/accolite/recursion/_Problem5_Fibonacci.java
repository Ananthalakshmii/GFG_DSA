package com.accolite.recursion;

public class _Problem5_Fibonacci {
	public static void main(String[] args) {
		int n=20;
		int fib=fibonacci(n);
		System.out.println(fib);
	}

	private static int fibonacci(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return fibonacci(n-1)+fibonacci(n-2);
	}
	
	

}
