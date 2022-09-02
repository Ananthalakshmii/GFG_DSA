package com.accolite.arrays;

public class MaximumCircularSumSubArrayEfficient {

	public static void main(String[] args) {
		int[] arr= {10,5,-5};
		int sum=maxCircularSumSubArray(arr);
		System.out.println(sum);
		int[] arr1={5,-2,3,4};
		System.out.println(maxCircularSumSubArray(arr1));
	}

	private static int maxCircularSumSubArray(int[] arr) {
		int max_normal=maxSumArrayNormal(arr);
		if(max_normal<0) //for all negative numbers
			return max_normal;
		int min_normal=minSumSubArrayNormal(arr); 
		//circular-> from normal array subtracting the minimum sum subarray results in max sum subarray in circular mode
		//so finding min sum subarray in normal array
		int sum_array=sumOfNormalArray(arr);
		int max_circular=sum_array-min_normal;
		
		int max_sum= Math.max(max_normal, max_circular);
		return max_sum;
	}

	private static int sumOfNormalArray(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++)
			sum+=arr[i];
		return sum;
	}

	private static int minSumSubArrayNormal(int[] arr) {
		int min_normal=arr[0];
		for(int i=1;i<arr.length;i++)
			min_normal=Math.min(min_normal, min_normal+arr[i]);
		return min_normal;
	}

	private static int maxSumArrayNormal(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			max=Math.max(max+arr[i], max);
		}
		return max;
	}
}


//o(n)