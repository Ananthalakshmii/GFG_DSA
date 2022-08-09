package com.accolite.bitmagic;

/*
 The Most Significant Bit (MSB) of the gray code is always equal to the MSB of the given binary code.
Other bits of the output gray code can be obtained by XORing binary code bit at that index and previous index.
 */
public class _Problem8_BinaryToGrayCodeEquivalent {
	public static void main(String[] args) {
		int N=7;
		int gray=greyConverter(N);
		System.out.println(gray);
		System.out.println(greyConverter(10));
	}

	private static int greyConverter(int n) {
		return n^(n>>1);
	}

}
