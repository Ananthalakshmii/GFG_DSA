package com.accolite.bitmagic;

/*
 The Most Significant Bit (MSB) of the binary code is always equal to the MSB of the given gray code.
Other bits of the output binary code can be obtained by checking the gray code bit at that index. 
If the current gray code bit is 0, then copy the previous binary code bit, else copy the invert of the previous binary code bit.
 */
public class _Problem9_GrayToBinaryEquivalent {
	public static void main(String[] args) {
		int N=15;
		int binary=grayToBinary(N);
		System.out.println(binary);
	}

	private static int grayToBinary(int n) {
		int res=n;
		while(n>0) {
			n=n>>1;
			res=res^n;
		}
		return res;
	}

}
