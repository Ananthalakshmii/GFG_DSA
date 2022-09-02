package com.accolite.arrays;

public class _Problem24_MaxCircularSubArraySum {
	public static void main(String[] args) {
		int N = 7;
		int arr[] = {8,-8,9,-9,10,-11,12};
		int sum=circularSubarraySum(arr,N);
		System.out.println(sum);
		
		int[] arr2={10,-3,-4,7,6,5,-4,-1};
		System.out.println(circularSubarraySum(arr2, 8));
		
		int[] arr3= {-12,-14};
		System.out.println(circularSubarraySum(arr3, 2));
	}

	private static int circularSubarraySum(int[] arr, int n) {
		
		int maxSum=maxSumSubarray(arr,n);
		if(maxSum<0) //for all negative numbers
			return maxSum;
		int minSum=minSumSubarray(arr,n);
		int totalSum=totalSum(arr,n);
		int maxCircularSum=totalSum-minSum;
		System.out.println(maxSum+" "+minSum+" "+totalSum+" "+maxCircularSum);
		return Math.max(maxSum, maxCircularSum);
	}

	private static int minSumSubarray(int[] arr, int n) {
		int currentMin=arr[0];
		int min=arr[0];
		for(int i=1;i<n;i++) {
			currentMin=Math.min(arr[i], currentMin+arr[i]);
			min=Math.min(min, currentMin);
		}
		return min;
	}

	private static int maxSumSubarray(int[] arr, int n) {
		int currentMax=arr[0];
		int max=arr[0];
		for(int i=1;i<n;i++) {
			currentMax=Math.max(arr[i], currentMax+arr[i]);
			max=Math.max(max, currentMax);
		}
		return max;
	}

	private static int totalSum(int[] arr, int n) {
		int sum=0;
		for(int i=0;i<n;i++)
			sum+=arr[i];
		return sum;
	}

}
