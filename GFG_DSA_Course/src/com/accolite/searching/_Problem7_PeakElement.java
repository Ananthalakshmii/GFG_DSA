package com.accolite.searching;

public class _Problem7_PeakElement {
	public static void main(String[] args) {
		int arr[]= {1,2,3};
		int index=peakElement(arr,arr.length);
		System.out.println(index);
		int[] arr1= {3,4};
		System.out.println(peakElement(arr1, 2));
	}

	private static int peakElement(int[] arr, int n) {
		int low=0;
		 int high=n;
		 while(low<=high) {
			 int mid=(low+high)/2;
			 if((mid==0 || arr[mid]>arr[mid-1]) && (mid==n-1 || arr[mid]>arr[mid+1]))
				 return mid;
			 if(mid>0 && arr[mid-1]>arr[mid])
				 high=mid-1;
			 else
				 low=mid+1;
		 }
		return -1;
	}

}
