package com.accolite.arrays;

import java.util.Arrays;

public class _Problem15_SmallestPositiveMissingNumber {
	public static void main(String[] args) {
		int N = 5;
		int arr[] = {0,-10,1,3,-20};
		int num=missingNumber(arr,N);
		System.out.println(num);
		
		System.out.println();
		int[] arr1= {0,1};
		System.out.println(missingNumber(arr1, 2));
	}

	private static int missingNumber(int[] arr, int size) {
		//checking if there is 1
		int num=0;
		for(int i=0;i<size;i++)
			if(arr[i]==1) {
				num=1;
				break;
			}
		if(num==0)
			return 1;
		
		//eliminating negative numbers
		for(int i=0;i<size;i++)
			if(arr[i]<=0 || arr[i]>size)
				arr[i]=1;
		
		//updating indices
		for(int i=0;i<size;i++)
			arr[(arr[i]-1)%size]+=size;
		
		//checking for indices whose value is less than size
		for(int i=0;i<size;i++)
			if(arr[i] <= size)
				return i+1;
		
		return size+1;
	}

}
