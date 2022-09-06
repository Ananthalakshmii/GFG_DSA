package com.accolite.searching;

public class _Problem10_2RepeatedElements {
	public static void main(String[] args) {
		int arr[] = {1,2,1,3,4,3};
		int[] list=twoRepeated(arr,4);
		for(int i:list)
		System.out.println(i);
	}

	private static int[] twoRepeated(int[] arr, int n) {
		int j=0;
		int res[]=new int[2];
		for(int i=0;i<n+2;i++) {
			int index=Math.abs(arr[i])-1;
			arr[index]=arr[index]*-1;
			if(arr[index]>0) {
				res[j++]=index+1;
			}
		}
		return res;
	}

}
