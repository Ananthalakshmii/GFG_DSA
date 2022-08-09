package com.accolite.bitmagic;

public class PowerOfTwoEfficient {

	public static void main(String[] args) {
		int n=20;
		boolean result=isPower2(n);
		System.out.println(result?"is power of 2":"not a power of 2");
	}

	private static boolean isPower2(int n) {
		if(n==0)
			return false;
		return ((n & (n-1))==0); // if it is a power of 2, then only 1 bit will be set
	}
}
