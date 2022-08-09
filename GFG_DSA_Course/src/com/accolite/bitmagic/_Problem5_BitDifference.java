package com.accolite.bitmagic;

public class _Problem5_BitDifference {
	public static void main(String[] args) {
		int A=10,B=20;
		int flip=countBitsFlip(A,B);
		System.out.println(flip);
	}

	private static int countBitsFlip(int a, int b) {
		int max=Math.max(a, b);
		int flips=0;
		for(int i=0;Math.pow(2, i)<=max;i++) {
			
			int tempa=(a%2==0)?0:1;
			int tempb=(b%2==0)?0:1;
			
			if((tempa^tempb) == 1) 
				flips++;
			
			a=a>>1;
			b=b>>1;
			
		}
		return flips;
	}

}
