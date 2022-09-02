package com.accolite.arrays;

public class CheckIfArrayIsSortedNaiveEfficient {
	public static void main(String[] args) {
		int[] arr= {8,10,10,12};
		boolean sort=isSorted(arr);
		System.out.println(sort);
	}

	private static boolean isSorted(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1])
				return false;
		}
		return true;
	}

}

//O(n)