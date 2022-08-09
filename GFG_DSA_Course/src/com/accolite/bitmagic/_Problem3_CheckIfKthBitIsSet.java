package com.accolite.bitmagic;

public class _Problem3_CheckIfKthBitIsSet {
	public static void main(String[] args) {
		int N=500,K=3;
		boolean valid=checkKthBit(N,K);
		System.out.println(valid?"k th bit is set":"k th bit is not set");
	}

	private static boolean checkKthBit(int n, int k) {
		return (((n>>k)&1)==1);
	}

}
