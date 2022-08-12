package com.accolite.recursion;

public class TailRecursion_Factorial {
	public static void main(String[] args) {
		int n=4;
		int temp=1;
		int fact=tailRecursionFactorial(n,temp);
		System.out.println(fact);
	}

	private static int tailRecursionFactorial(int n, int temp) {
		if(n==0||n==1)
			return temp;
		return tailRecursionFactorial(n-1, n*temp); //n*f(n-1)
	}

}
