package com.accolite.arrays;

//given an array of integers and a number k, find the max sum of k consecutive nums

public class SlidingWindowTechnique {
	public static void main(String[] args) {
		int[] arr= {1,8,30,-5,20,7};
		int k=3;
		int sum=maxSumInKWindow(arr,k);
		System.out.println(sum);
	}

	private static int maxSumInKWindow(int[] arr, int k) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i+k-1<arr.length;i++) {
			int sum=0;
			for(int j=0;j<k;j++) {
				sum+=arr[i+j];
			}
			max=Math.max(max, sum);
		}
		return max;
	}

}

//o(n^2)