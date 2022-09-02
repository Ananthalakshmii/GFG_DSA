package com.accolite.arrays;

public class LongestEvenOddSubArrayEfficient { //kadane algorithm

	public static void main(String[] args) {
		int[] arr= {10,12,14,7,8};
		int max=alternatingEvenOdd(arr);
		System.out.println(max);
	}

	private static int alternatingEvenOdd(int[] arr) {
		int result=1;
		int current=1;
		for(int i=1;i<arr.length;i++) {
			if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2==0)) {
				current++;
				result=Math.max(current, result);
			}else
				current=1;
		}
		return result;
	}
	
}

//o(n)