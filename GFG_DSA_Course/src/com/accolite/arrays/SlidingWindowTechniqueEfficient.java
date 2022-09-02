package com.accolite.arrays;

public class SlidingWindowTechniqueEfficient {

	public static void main(String[] args) {
		int[] arr= {1,8,30,-5,20,7};
		int k=3;
		int sum=maxSumInKWindow(arr,k);
		System.out.println(sum);
	}

	private static int maxSumInKWindow(int[] arr, int k) {
		int current_sum=0;
		for(int i=0;i<k;i++)
			current_sum+=arr[i];
		int max=current_sum;
		for(int i=k;i<arr.length;i++) {
			current_sum=(current_sum+arr[i]-arr[i-k]);
			max=Math.max(max, current_sum);
		}
		return max;
	}
}

//o(n)