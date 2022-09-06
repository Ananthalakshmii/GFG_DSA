package com.accolite.searching;

public class _Problem16_AllocateMinNoOfPages {
	public static void main(String[] args) {
		int arr[] = {12,34,67,90};
		int pages=findPages(arr,4,2);
		System.out.println(pages);
	}

	private static int findPages(int[] arr, int length, int noOfStudents) {
		if(noOfStudents>length)
	            return -1;
		int sum=0;
		int max=0;
		
		for(int i=0;i<length;i++) {
			sum+=arr[i];
			max=Math.max(max, arr[i]);
		}
		if(length==noOfStudents)
		    return max;
		
		int low=max;
		int high=sum;
		int result=0;
		while(low<=high) {
			int mid=(low+high)/2;
			if(isFeasible(arr,length,noOfStudents,mid)) {
				result=mid;
				high=mid-1;//there might be min soln without inc mid element
			}else {
				low=mid+1;
			}
		}
		return result;
	}

	private static boolean isFeasible(int[] arr, int length, int noOfStudents, int result) {
		int currStud=1;
		int sum=0;
		
		for(int i=0;i<length;i++) {
			if(sum+arr[i]<=result) {
				sum+=arr[i];
			}else if(sum+arr[i]>result) {
				currStud++;
				sum=arr[i];
			}
		}
		
		if(currStud<=noOfStudents)
			return true;
		return false;
	}

}
