package com.accolite.bitmagic;

public class CheckIfKthBitIsSetLeftShift {

	public static void main(String[] args) {
		int n=5,k=3;
		checkKthBit(n,k);

	}

	private static void checkKthBit(int n, int k) {
		if((n& (1<<(k-1)))!=0)
			System.out.println("k th bit is set to 1");
		else
			System.out.println("k th bit is set to 0");
	}

}
