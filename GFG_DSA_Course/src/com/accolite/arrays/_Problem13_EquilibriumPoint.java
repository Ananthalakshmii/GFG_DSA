package com.accolite.arrays;

public class _Problem13_EquilibriumPoint {
	public static void main(String[] args) {
		long[] arr= {1,3,5,2,2};
		int n=5;
		int index=equilibriumPoint(arr,n);
		System.out.println(index);
	}

	private static int equilibriumPoint(long[] arr, int n) {
		long sum=0;
		for(int i=0;i<n;i++)
			sum+=arr[i];
		
		int left_sum=0;
		for(int i=0;i<n;i++) {
			if(left_sum==(sum-arr[i]))
				return i+1;
			else {
				left_sum+=arr[i];
				sum=sum-arr[i];
			}
		}
		return -1;
	}

}
