package com.accolite.recursion;

public class DecimalToBinary {
	public static void main(String[] args) {
		int n=7;
		decimalToBinary(n);
		System.out.println();
		decimalToBinary(13);
	}

	private static void decimalToBinary(int n) {
		if(n==0)
			return ;
		decimalToBinary(n/2);
		System.out.print(n%2);
		
	}

}
