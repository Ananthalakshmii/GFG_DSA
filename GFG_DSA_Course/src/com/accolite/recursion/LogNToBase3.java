package com.accolite.recursion;

public class LogNToBase3 {
	public static void main(String[] args) {
		int n=16;
		int result= logNToBase3(n);
		System.out.println(result);
	}

	private static int logNToBase3(int n) {
		if(n<3)
			return 0;
		else 
			return 1+logNToBase3(n/3);
	}

}

// for every power of 3, value increments by 1.
// else it returns floor of (log n) to the base 3