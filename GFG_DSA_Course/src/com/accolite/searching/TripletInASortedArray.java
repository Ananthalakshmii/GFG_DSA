package com.accolite.searching;

public class TripletInASortedArray {
	public static void main(String[] args) {
		int[] arr= {2,5,10,15,18};
		int sum=33;
		boolean exists=sumExists(arr,sum);
		System.out.println(exists);
	}

	private static boolean sumExists(int[] arr, int sum) {
		for(int i=0;i<arr.length-2;i++) {
			int ele1=arr[i];
			boolean exists=sumExistsSubarray(arr,sum-ele1,i);
			if(exists)
				return true;
		}
		return false;
	}

	private static boolean sumExistsSubarray(int[] arr, int sum, int index) {
		int low=index+1;
		int high=arr.length-1;
		while(low<high) {
			int cursum=arr[low]+arr[high];
			if(cursum==sum)
				return true;
			if(cursum<sum)
				low++;
			else
				high--;
		}
		
		return false;
	}

}

//o(n^2)
//same time complexity for both sorted or unsorted--> bcoz to sort it takes o(nlogn) and for triplet it will be o(n2) resulting in same o(n2)