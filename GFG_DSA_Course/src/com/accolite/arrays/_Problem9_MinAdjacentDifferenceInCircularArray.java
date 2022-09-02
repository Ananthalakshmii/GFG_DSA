package com.accolite.arrays;

public class _Problem9_MinAdjacentDifferenceInCircularArray {
	public static void main(String[] args) {
		int n = 7;
		int	Arr[] = {8,-8,9,-9,10,-11,12};
		int min=minAdjDiff(Arr,n);
		System.out.println(min);
	}

	private static int minAdjDiff(int[] arr, int n) {
		int min=Integer.MAX_VALUE;
		int diff;
		for(int i=0;i<n-1;i++) {
			diff=Math.abs(arr[i+1]-arr[i]);
			if(diff<min)
				min=diff;
		}
		return Math.min(min, Math.abs(arr[n-1]-arr[0]));
	}

}
