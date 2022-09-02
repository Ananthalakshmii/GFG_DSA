package com.accolite.arrays;

public class MaximumSumSubArrayNaive {
	public static void main(String[] args) {
		int[] arr= {1,-2,3,-1,2};
		int sum=maxSum(arr);
		System.out.println(sum);
	}

	private static int maxSum(int[] arr) {
		int result=0;
		
		for(int i=0;i<arr.length;i++) {
			int current=0;
			for(int j=i;j<arr.length;j++) {
				current=current+arr[j];
				result=Math.max(current, result);
			}
		}
		return result;
	}

}

//o(n^2)