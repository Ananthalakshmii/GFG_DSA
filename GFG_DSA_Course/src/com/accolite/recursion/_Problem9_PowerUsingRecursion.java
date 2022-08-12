package com.accolite.recursion;

public class _Problem9_PowerUsingRecursion {
	public static void main(String[] args) {
		int n=9,p=9;
		int pow=power(n,p);
		System.out.println(pow);
	}

	private static int power(int n, int p) {
		if(p==0)
			return 1;
		return n*power(n, p-1);
	}

}
