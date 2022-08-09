package com.accolite.bitmagic;

public class _Problem7_LongestConesecutive1s {
	public static void main(String[] args) {
		int N=222;
		int count=maxConsecutiveOnes(N);
		System.out.println(count);
	}

	private static int maxConsecutiveOnes(int n) {
		int count=0;
		int maxCount=0;
		
		while(n>0) {
			if((n&1)!=0) {
				count++;
				maxCount=Math.max(count, maxCount);
			}else {
				count=0;
			}
			n=n>>1;
		}
		
		return maxCount;
	}

}
