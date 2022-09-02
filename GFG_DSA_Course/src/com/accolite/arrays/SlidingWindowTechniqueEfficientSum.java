package com.accolite.arrays;

//given array, k and sum
public class SlidingWindowTechniqueEfficientSum {

	public static void main(String[] args) {
		int[] arr= {1,8,30,-5,20,7};
		int k=3;
		int sum=45;
		boolean exists=maxSumInKWindow(arr,k,sum);
		System.out.println(exists);
	}

	private static boolean maxSumInKWindow(int[] arr, int k,int sum) {
		int current_sum=0;
		for(int i=0;i<k;i++)
			current_sum+=arr[i];
		if(current_sum==sum)
			return true;

		for(int i=k;i<arr.length;i++) {
			current_sum=(current_sum+arr[i]-arr[i-k]);
			if(current_sum==sum)
				return true;
		}
		return false;
	}
}

//o(n)