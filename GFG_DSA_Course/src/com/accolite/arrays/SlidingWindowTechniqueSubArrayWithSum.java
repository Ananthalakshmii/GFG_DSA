package com.accolite.arrays;

//given an unsorted array of NON NEGATIVE integers. find if there is a sub array with given sum

public class SlidingWindowTechniqueSubArrayWithSum {

	public static void main(String[] args) {
		int[] arr= {1,8,30,-5,20,7};
		int sum=45;
		boolean exists=subArraySumInWindow(arr,sum);
		System.out.println(exists);
	}

	private static boolean subArraySumInWindow(int[] arr, int sum) {
		int current_sum=arr[0];
		int start=0;
		for(int end=1;end<arr.length;end++) {
			current_sum+=arr[end];
			
			while(current_sum>sum && start<end-1) {
				current_sum=current_sum-arr[start];
				start++;
			}
			if(current_sum==sum)
				return true;

		}
		return false;
	}
}

//o(n) - even if 2 loops because each element goes in once and comes out once
