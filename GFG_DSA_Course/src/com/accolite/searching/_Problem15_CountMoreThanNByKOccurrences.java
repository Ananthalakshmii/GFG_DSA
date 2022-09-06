package com.accolite.searching;

public class _Problem15_CountMoreThanNByKOccurrences {
	public static void main(String[] args) {
		int arr[] = {3,1,2,2,1,2,3,3};
		int count=countOccurence(arr,8,4);
		System.out.println(count);
		int[] arr1= {2,3,3,2};
		System.out.println(countOccurence(arr1, 4, 3));
		int[] arr2= {2,35,35,2,4};
		System.out.println(countOccurence(arr2, 5, 2));
		int[] arr3= {54 ,7 ,9, 11, 9, 11, 54, 78, 98, 11, 7, 12, 11, 7, 11};
		System.out.println(countOccurence(arr3, 15, 7));
	}

	private static int countOccurence(int[] arr, int n, int k) {
		int total=0;
		int count[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]%n+" ");
			count[arr[i]%n]++;
		}
		for(int i=0;i<n;i++) {
			if(count[i]>(n/k))
				total++;
		}
		return total;
	}

}
