package com.accolite.searching;

public class _Problem6_LeftIndex {
	public static void main(String[] args) {
		int arr[] = {1,1,2,2,3,4,5,5,6,7};
		int index=leftIndex(arr,arr.length,1);
		System.out.println(index);
		int arr1[]={10,20,20,20,20,20,20};
		System.out.println(leftIndex(arr1, 7, 20));
		int arr2[]= {4,4,5,7,8};
		System.out.println(leftIndex(arr2, 5, 10));
	}

	private static int leftIndex(int[] arr, int n, int x) {
		int low=0;
		int high=n-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]<x)
				low=mid+1;
			else if(arr[mid]>x)
				high=mid-1;
			else {
				if(mid==0 || arr[mid-1]!=x)
					return mid;
				else
					high=mid-1;
			}
		}
		return -1;
	}

}
