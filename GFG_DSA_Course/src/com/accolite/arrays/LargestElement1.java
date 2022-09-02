package com.accolite.arrays;

public class LargestElement1 {
	public static void main(String[] args) {
		int[] arr= {5,8,20,10};
		int index=getLargest(arr);
		System.out.println(index);
	}

	private static int getLargest(int[] arr) {
		int res=0;
		for(int i=1;i<arr.length;i++)
			if(arr[i]>arr[res])
				res=i;
		return res;
	}

}

//O(n)