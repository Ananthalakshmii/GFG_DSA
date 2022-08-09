package com.accolite.bitmagic;

public class CountSetBits_BrianKerningam {

	public static void main(String[] args) {
		int n=7;
		int result=countSetBitsBrian(n);
		System.out.println(result);
	}

	private static int countSetBitsBrian(int n) {
		int result=0;
		while(n>0) {
			n= n & (n-1); // to turn off the last set bit (trailing wil become 0's) 32 & 31
			result++;
		}
		return result;
	}
}


//theta(set bit count)