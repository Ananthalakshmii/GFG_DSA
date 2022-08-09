package com.accolite.bitmagic;

public class CountSetBitsNaive {

	public static void main(String[] args) {
		int n=7;
		int result=countSetBits(n);
		System.out.println(result);
	}

	private static int countSetBits(int n) {
		int result=0;
		while(n>0) {
		if((n&1)==1) {
			result++;
			
		}
		n=n>>1;
		}
		return result;
	}

}

//theta(total bits in n)