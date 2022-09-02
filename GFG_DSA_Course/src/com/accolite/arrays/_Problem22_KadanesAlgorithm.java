package com.accolite.arrays;

public class _Problem22_KadanesAlgorithm {
	public static void main(String[] args) {
		int n=5;
		int arr[]= {1,2,3,-2,5};
		long maxSum=maxSubarraySum(arr,n);
		System.out.println(maxSum);
		int[] arr1= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubarraySum(arr1, arr1.length));
		int[] arr2= {-1,-2,-3,-4};
		System.out.println(maxSubarraySum(arr2, 4));
	}

	private static long maxSubarraySum(int[] arr, int n) {
		int currentsum=arr[0];
		int max=arr[0];
		for(int i=1;i<n;i++) {
			currentsum=Math.max(currentsum+arr[i], arr[i]);
			max=Math.max(max, currentsum);
		}
		return max;
	}

}
