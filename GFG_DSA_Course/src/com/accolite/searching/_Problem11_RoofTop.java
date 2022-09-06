package com.accolite.searching;

public class _Problem11_RoofTop {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		int height=maxStep(arr,4);
		System.out.println(height);
		int[] arr1={1,2,2,3,2};
		System.out.println(maxStep(arr1, 5));
	}

	private static int maxStep(int[] arr, int n) {
		int max=0;
		int curr_max=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]<arr[i+1]) {
				curr_max=curr_max+1;
				max=Math.max(curr_max, max);
			}else {
				curr_max=0;
			}
		}
		return max;
	}

}
