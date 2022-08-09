package com.accolite.bitmagic;

public class TwoOddOccuringEfficient {
	public static void main(String[] args) {
		int[] arr= {3,4,3,4,8,4,4,32,7,7};
		twoOddOccuring(arr);
	}

	private static void twoOddOccuring(int[] arr) {
		int xor=0,res1=0,res2=0;
		for(int i=0;i<arr.length;i++)
			xor=xor^arr[i]; //xor of 8 and 32
		int bit=xor & ~(xor-1); //to find rightmost set bit
		for(int i=0;i<arr.length;i++) {
			if((arr[i] & bit) ==0) // bitwise and to check for bit equality
				res1=res1^arr[i];
			else
				res2=res2^arr[i];
		}
		System.out.println(res1+" "+res2);
	}

}


//theta(n)