package com.accolite.recursion;

public class _Problem8_LuckyNumbers {
	public static void main(String[] args) {
		int n=19;
		boolean isLucky=isLucky(n);
		System.out.println(isLucky);
	}

	private static boolean isLucky(int n) {
		return isLucky(n,2);
	}

	private static boolean isLucky(int n, int m) {
		if(n%m==0)
			return false;
		if(m>n)
			return true;
		
		return isLucky(n-(n/m), m+1);
	}

}
