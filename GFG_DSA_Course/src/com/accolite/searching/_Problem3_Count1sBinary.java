package com.accolite.searching;

public class _Problem3_Count1sBinary {
	public static void main(String[] args) {
		int N = 8;
		int arr[] = {1,1,1,1,1,0,0,0};
		int count=countOnes(arr,N);
		System.out.println(count);
		int arr1[] = {1,1,0,0,0,0,0,0};
		System.out.println(countOnes(arr1, 8));
	}

	private static int countOnes(int[] arr, int n) {
		int lastOccurrence=lastOccurrence(arr,n,1);
		return lastOccurrence+1;
	}

	private static int lastOccurrence(int[] arr, int n, int x) {
		int low=0;
		int high=n;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==0)
				high=mid-1;
			else {
				if(mid==n-1 || arr[mid+1]!=1)
					return mid;
				else
					low=mid+1;
			}
				
		}
		return -1;
		
	}

}
