package com.accolite.arrays;

public class CheckIfArrayIsSortedNaive {
	public static void main(String[] args) {
		int[] arr= {8,10,10,12};
		boolean sort=isSorted(arr);
		System.out.println(sort);
	}

	private static boolean isSorted(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j])
					return false;
			}
		}
		return true;
	}

}

//O(n pow 2)