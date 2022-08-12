package com.accolite.recursion;

public class NaturalNumberSum {
	public static void main(String[] args) {
		int n=5;
		int sum=naturalNumberSum(n); //n>0
		System.out.println(sum);
	}

	private static int naturalNumberSum(int n) {
		if(n==0)
			return 0;
		return n+naturalNumberSum(n-1);
	}

}

//theta(n)
//T(n)=T(n-1)+theta(n)
//aux space- theta(n)