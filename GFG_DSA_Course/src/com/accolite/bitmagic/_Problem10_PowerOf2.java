package com.accolite.bitmagic;

public class _Problem10_PowerOf2 {

	public static void main(String[] args) {
		int N=98;
		boolean pow=isPowerOfTwo(N);
		System.out.println(pow?"is a power of 2":"not a power of 2");
		
	}

	private static boolean isPowerOfTwo(int n) {
		if(n==0)
			return false;

		return ((n& (n-1))==0);
	}
}
