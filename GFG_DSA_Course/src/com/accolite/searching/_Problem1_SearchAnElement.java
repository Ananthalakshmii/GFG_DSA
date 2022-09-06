package com.accolite.searching;

public class _Problem1_SearchAnElement {
	public static void main(String[] args) {
		int n = 4;
		int arr[] = {1,2,3,4};
		int x = 3;
		int index=search(arr,n,x);
		System.out.println(index);
	}

	private static int search(int[] arr, int n, int x) {
		
		for(int i=0;i<n;i++)
	        if(arr[i]==x)
	       return i;
	       
	       return -1;
	       
	}

}
