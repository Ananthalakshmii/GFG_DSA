package com.accolite.recursion;

public class _Problem7_JosephusProblem {
	public static void main(String[] args) {
		int n=5,k=3;
		int survivor=josephus(n,k);
		System.out.println(survivor);
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
