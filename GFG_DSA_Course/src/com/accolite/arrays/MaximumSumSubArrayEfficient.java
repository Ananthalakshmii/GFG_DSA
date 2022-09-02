package com.accolite.arrays;

public class MaximumSumSubArrayEfficient {
	
	public static void main(String[] args) {
		int[] arr= {1,-2,3,-1,2};
		int sum=maxSum(arr);
		System.out.println(sum);
	}

	private static int maxSum(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
			max=Math.max(max+arr[i], arr[i]);
		return max;
	}

}


//o(n)