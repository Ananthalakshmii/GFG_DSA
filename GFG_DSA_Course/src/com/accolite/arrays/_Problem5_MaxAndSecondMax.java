package com.accolite.arrays;

import java.util.ArrayList;
import java.util.List;

public class _Problem5_MaxAndSecondMax {
	public static void main(String[] args) {
		int N = 3;
		int arr[] = {2,1,2};
		List<Integer> list=largestAndSecondLargest(N,arr);
		System.out.println(list);
		
		int[] arr1= {10, 10, 10, 10, 10, 10};
		System.out.println(largestAndSecondLargest(6, arr1));
	}

	private static List<Integer> largestAndSecondLargest(int sizeOfArray, int[] arr) {
		int largest=-1,secondLargest=-1;
		for(int i=0;i<sizeOfArray;i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
			}
			if(arr[i]<largest && arr[i]!=largest) {
				if(arr[i]>secondLargest)
					secondLargest=arr[i];
			}
		}
		ArrayList<Integer> list=new ArrayList<>();
		list.add(largest);
		list.add(secondLargest);
		return list;
	}

}
