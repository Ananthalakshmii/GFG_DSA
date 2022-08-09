package com.accolite.bitmagic;

public class PowerOfTwoNaive {
	public static void main(String[] args) {
		int n=6;
		boolean result=isPower2(n);
		System.out.println(result?"is power of 2":"not a power of 2");
	}

	private static boolean isPower2(int n) {
		if(n==0)
			return false;
		while(n!=1) {
			if(n%2!=0)
				return false;
			n=n/2;
		}
		return true;
	}

}

//theta(number of bits represented)