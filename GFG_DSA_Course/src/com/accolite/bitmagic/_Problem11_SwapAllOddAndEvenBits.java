package com.accolite.bitmagic;

/*
   //0xAAAAAAAA means 10101010101010101010101010101010 in binary.
       //we get all even bits of n.
   //0x55555555 means 01010101010101010101010101010101 in binary.
      //we get all odd bits of n.
 */
public class _Problem11_SwapAllOddAndEvenBits {
	public static void main(String[] args) {
		int N=23;
		int num=swapAllOddAndEvenBits(N);
		System.out.println(num);
	}

	private static int swapAllOddAndEvenBits(int n) {
		return ((n&0xAAAAAAAA)>>1) | ((n&0x55555555)<<1);
	}

}
