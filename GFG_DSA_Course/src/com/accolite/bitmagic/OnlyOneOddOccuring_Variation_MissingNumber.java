package com.accolite.bitmagic;

/*
 given an array of n number that has values in range[1..n+1]. every number appears exactly once.
 hence one no is missing. find the missing no
 
 xor of all numbers from 1 to n+1 with xor of all array elements xor that gives result
 because all others will appear twice- one in range 1 to n+1 and once in array element
 */
public class OnlyOneOddOccuring_Variation_MissingNumber {

	public static void main(String[] args) {
		int[] arr= {1,4,3};
		int result=missingNumber(arr);
		System.out.println(result);
	}

	private static int missingNumber(int[] arr) {
		int result=0;
		int n=arr.length+1;
		int xor=0;
		for(int i=1;i<=n;i++)
			xor=xor^i;
		for(int i=0;i<arr.length;i++)
			result=result^arr[i];
		result=result ^ xor;
		return result;
	}
}
