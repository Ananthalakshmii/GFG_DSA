package com.accolite.searching;

import java.awt.Point;

public class _Problem14_CountOnlyRepeated {
	public static void main(String[] args) {
		int arr[] = {2,3,4,5,5};
		Point point=findRepeating(arr,5);
		System.out.println(point);
	}

	private static Point findRepeating(int[] arr, int n) {
		int count=n-(arr[n-1]-arr[0]);
		int low=0;
		int high=n-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]>=mid+arr[0]) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		
		if(count==1)
			return new Point(-1, -1);
		return new Point(arr[low], count);
	}
}
