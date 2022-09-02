package com.accolite.arrays;

public class MaximumCircularSumSubArrayNaive {
	public static void main(String[] args) {
		int[] arr= {10,5,-5};
		int sum=maxCircularSumSubArray(arr);
		System.out.println(sum);
		int[] arr1={5,-2,3,4};
		System.out.println(maxCircularSumSubArray(arr1));
	}

	private static int maxCircularSumSubArray(int[] arr) {
		int result=arr[0];
		for(int i=0;i<arr.length;i++) {
			int current_sum=arr[i];
			int current_max=arr[i];
			for(int j=1;j<arr.length;j++) {
				int index=(i+j)%arr.length;
				current_sum+=arr[index];
				current_max=Math.max(current_max, current_sum);
			}
			result=Math.max(current_max, result);
		}
		return result;
	}

}

//0(n^2)