package com.accolite.arrays;

public class _Problem6_StrongestNeighbour {
	public static void main(String[] args) {
		int n = 6;
		int arr[] = {1,2,2,3,4,5};
		maximumAdjacent(n,arr);
	}

	private static void maximumAdjacent(int sizeOfArray, int[] arr) {
		for(int i=0;i<sizeOfArray-1;i++) {
			System.out.print(arr[i]>arr[i+1]?arr[i]:arr[i+1]);
			System.out.print(" ");
		}
	}

}
