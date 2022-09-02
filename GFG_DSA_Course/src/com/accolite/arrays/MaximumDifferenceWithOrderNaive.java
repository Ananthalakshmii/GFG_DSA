package com.accolite.arrays;

// max value of arr[j]-arr[i] such that j>i

public class MaximumDifferenceWithOrderNaive {
	public static void main(String[] args) {
		int[] arr= {2,3,10,6,4,8,1};
		maxDifference(arr);
	}

	private static void maxDifference(int[] arr) {
		int res=arr[1]-arr[0];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				res=Math.max(res, arr[j]-arr[i]);
			}
		}
		System.out.println(res);
	}

}


//theta(n^2)