package com.accolite.searching;

//sorted array, find a pair with the given sum
public class TwoPointerApproach {

	public static void main(String[] args) {
		int[] arr= {2,4,8,9,11,12,20,30};
		int sum=23;
		boolean exists=sumExists(arr,sum);
		System.out.println(exists);
	}

	private static boolean sumExists(int[] arr,int sum) {
		int low=0;
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


//o(n)