package com.accolite.recursion;

public class _Problem1_Print1ToN {
	public static void main(String[] args) {
		int n=10;
		int k=0;
		print1ToN(n,k);
	}

	private static void print1ToN(int n, int k) {
		if(k==n)
			return;
		System.out.println(k+1);
		print1ToN(n, k+1);
		
	}

}
