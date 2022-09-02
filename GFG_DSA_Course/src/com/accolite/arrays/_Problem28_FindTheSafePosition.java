package com.accolite.arrays;

public class _Problem28_FindTheSafePosition {
	public static void main(String[] args) {
		int n=2,k=1;
		int survivor=josephus(n,k);
		System.out.println(survivor);
		System.out.println(josephus(4, 2));
	}
	
	private static int josephus(int n, int k) {
		return 1+myJosephus(n,k);
	}

	private static int myJosephus(int n, int k) {
		if(n==0)
			return 0;
		return (myJosephus(n-1, k)+k)%n;
	}


}
