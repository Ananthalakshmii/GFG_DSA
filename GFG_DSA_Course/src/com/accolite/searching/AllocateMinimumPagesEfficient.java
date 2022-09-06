package com.accolite.searching;

public class AllocateMinimumPagesEfficient {

	public static void main(String[] args) {
		int[] arr= {10,20,10,30}; //unsorted array
		int noOfStudents=2;
		int minPages=allocateMinPages(arr,arr.length,noOfStudents);
		System.out.println(minPages);
	}

	private static int allocateMinPages(int[] arr, int length, int noOfStudents) {
		int sum=0;
		int max=0;
		
		//finding the sum of total array and max in the entire array
		for(int i=0;i<length;i++) {
			sum=sum+arr[i];
			max=Math.max(max, arr[i]);
		}
		
		//soln lies bwn max and sum
		//so doing binary search with these 2
		
		//Binary search
		int low=max;
		int high=sum;
		int result=0;
		while(low<=high) {
			int mid=(low+high)/2;
			if(isFeasible(arr,length,noOfStudents,mid)) {// there might be a soln in the left subarray with min no of pages
				result=mid; //storing the upper bound value
				high=mid-1;
			}else
				low=mid+1;
				
		}
		return result;
	}

	private static boolean isFeasible(int[] arr, int length, int noOfStudents, int result) {
		int currStudents=1;
		int sum=0;
		
		for(int i=0;i<length;i++) {
			if(sum+arr[i]>result) {
				currStudents++;
				sum=arr[i];
			}else
				sum=sum+arr[i];
		}
		
		return (currStudents<=noOfStudents)?true:false;
	}
}


//o(nlog(sum))