package com.accolite.searching;

public class _Problem8_FloorInSortedArray {
	public static void main(String[] args) {
		int arr[] = {1,2,8,10,11,12,19};
		int index=findFloor(arr,7,0);
		System.out.println(index);
		int arr1[] = {1,2,8,10,11,12,19};
		System.out.println(findFloor(arr1, 7, 5));
	}

	private static int findFloor(int[] arr, int n, int x) {
		int low=0;
		int high=n-1;
		int result=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]>x)
				high=mid-1;
			else {
				result=mid;
				low=mid+1;
			}
			
		}
		return result;
	}

}
