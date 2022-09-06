package com.accolite.searching;

public class _Problem5_MajorityElement {
	public static void main(String[] args) {
		int[] arr= {1,2,3};
		int n=3;
		int majority=majorityElement(arr,n);
		System.out.println(majority);
		int[] arr1= {3,1,3,3,2};
		System.out.println(majorityElement(arr1, 5));
	}

	private static int majorityElement(int[] arr, int n) {
		// first phase - choosing a candidate as majority element
		int result=0;
		int count=1;
		for(int i=0;i<n;i++) {
			if(arr[i]==arr[result])
				count++;
			else
				count--;
			if(count==0) {
				result=i;
				count=1;
			}
		}
		
		//second phase- to check if the chosen candidate is majority or not-> occurs when there is no majority element in the array
		
		count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==arr[result])
				count++;
		}
		if(count>n/2)
			return arr[result];
		
		return -1;
	}

}
