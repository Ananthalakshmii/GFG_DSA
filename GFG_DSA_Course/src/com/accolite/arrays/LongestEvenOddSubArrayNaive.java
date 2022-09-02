package com.accolite.arrays;

//alternating even odd
public class LongestEvenOddSubArrayNaive {

	public static void main(String[] args) {
		int[] arr= {10,12,14,7,8};
		int max=alternatingEvenOdd(arr);
		System.out.println(max);
	}

	private static int alternatingEvenOdd(int[] arr) {
		int result=1;
		for(int i=0;i<arr.length;i++) {
			int current=1;
			for(int j=i+1;j<arr.length;j++) {
				if((arr[j]%2==0 && arr[j-1]%2!=0) || (arr[j]%2!=0 && arr[j-1]%2==0))
					current+=1;
				else
					break;
			}
			result=Math.max(result, current);
		}
		return result;
	}
}

//o(n^2)