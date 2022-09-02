package com.accolite.arrays;

public class _Problem23_LongestSubArrayOfEvenAndOdds {
	public static void main(String[] args) {
		int n = 5;
		int arr[] = {10,12,14,7,8};
		int length=maxEvenOdd(arr,n);
		System.out.println(length);
	}

	private static int maxEvenOdd(int[] arr, int n) {
		int currentLength=1;
		int maxLength=1;
		
		for(int i=0;i<n-1;i++) {
			if((arr[i]%2==0 && arr[i+1]%2!=0) || (arr[i]%2!=0 && arr[i+1]%2==0)) {
				currentLength++;
				maxLength=Math.max(maxLength, currentLength);
			}else
				currentLength=1;
		}
		return maxLength;
	}

}
