package com.accolite.searching;

public class _Problem2_SearchAnElementSorted {

	public static void main(String[] args) {
		int n = 4;
		int arr[] = {1,2,3,4};
		int x = 3;
		int index=search(arr,n,x);
		System.out.println(index);
	}
	
private static int search(int[] arr, int n, int x) {
	       
		int low=0;
		int high=n;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==x)
				return mid;
			if(arr[mid]<x)
				low=mid+1;
			else
				high=mid-1;
		}
		return -1;
	}

}
