package com.accolite.arrays;

// max value of arr[j]-arr[i] such that j>i

public class MaximumDifferenceWithOrderNaiveEfficient {
	public static void main(String[] args) {
		int[] arr= {2,3,10,6,4,8,1};
		maxDifference(arr);
	}

	private static void maxDifference(int[] arr) {
		int maxDiff=arr[1]-arr[0];
		int minVal=arr[0];
		for(int j=1;j<arr.length;j++) {
			maxDiff=Math.max(maxDiff, arr[j]-minVal);
			minVal=Math.min(minVal, arr[j]);
		}
		System.out.println(maxDiff);
	}

}


//theta(n)