package com.accolite.arrays;

import java.util.Arrays;

public class _Problem3_MeanAndMedianOfArray {

	public static void main(String[] args) {
		int arr[] = {1,2,19,28,5};
		int N=arr.length;
		int mean=mean(arr,N);
		int median=median(arr,N);
		System.out.print(mean+" "+median);
		System.out.println();
		int arr1[]= {2,8,3,4};
		System.out.print(mean(arr1,4)+" "+median(arr1, 4));
	}

	private static int median(int[] arr, int N) {
		Arrays.sort(arr);
		if(N%2!=0)
			return arr[N/2];
		else
			return (int) Math.floor((arr[N/2]+arr[N/2-1])/2);
		
		
	}

	private static int mean(int[] arr, int N) {
		
		int sum=0;
		for(int i=0;i<N;i++)
			sum+=arr[i];
		return (int) Math.floor((sum/N));
	}
	
}
