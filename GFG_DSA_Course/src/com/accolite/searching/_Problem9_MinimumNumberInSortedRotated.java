package com.accolite.searching;

import java.util.Arrays;

public class _Problem9_MinimumNumberInSortedRotated {
	public static void main(String[] args) {
		int arr[] = {2,3,4,5,6,7,8,9,10,1};
		int min=minNumber(arr,0,arr.length-1);
		System.out.println(min);
		int[] arr1= {3,4,5,1,2};
		System.out.println(minNumber(arr1, 0, arr1.length-1));
	}

	private static int minNumber(int[] arr, int low, int high) {
		int min=arr[0];
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]>=arr[0]) {
				low=mid+1;//shift to right subarray
			}else {//shift to left subarray
				min=Math.min(arr[mid], min);
				high=mid-1;
			}
		}
		return min;
	}

}
