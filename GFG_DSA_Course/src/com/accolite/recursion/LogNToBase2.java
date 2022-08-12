package com.accolite.recursion;

public class LogNToBase2 {
	public static void main(String[] args) {
		int n=16;
		int result= logNToBase2(n);
		System.out.println(result);
	}

	private static int logNToBase2(int n) {
		if(n==1)
			return 0;
		else 
			return 1+logNToBase2(n/2);
	}

}

// for every power of 2, value increments by 1.
// else it returns floor of (log n) to the base 2