package com.accolite.bitmagic;

public class _Problem2_RightmostDifferentBit {
	public static void main(String[] args) {
		int M=8,N=0;
		int index=posOfRightMostDiffBit(M,N);
		System.out.println(index);
	}

	private static int posOfRightMostDiffBit(int m, int n) {
		/*
		 * int max=Math.max(m, n); int counter=(int) Math.sqrt(max);
		 * System.out.println(counter);
		 */
		for(int i=0;i<32;i++) {
			if((((m^n)>>i)&1)==1)
				return i+1;
		}
		return -1;
	}

}
