package com.accolite.recursion;

public class Print1ToN {
	public static void main(String[] args) {
		int n=5;
		print1ToN(n);
	}

	private static void print1ToN(int n) {
		if(n==0)
			return;
		print1ToN(n-1);
		System.out.println(n);
		
	}

}

//theta(n)
//aux space: O(n)