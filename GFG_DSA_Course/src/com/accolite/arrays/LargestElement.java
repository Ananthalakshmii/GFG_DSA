package com.accolite.arrays;

public class LargestElement {
	public static void main(String[] args) {
		int[] arr= {5,8,20,10};
		int max=getLargest(arr);
		System.out.println(max);
	}

	private static int getLargest(int[] arr) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
			if(arr[i]>max)
				max=arr[i];
		return max;
	}

}

//O(n)