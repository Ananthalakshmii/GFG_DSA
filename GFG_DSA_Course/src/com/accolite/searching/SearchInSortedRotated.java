package com.accolite.searching;

public class SearchInSortedRotated {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,8,9};
		int search=30;
		int index=searchSortedRotated(arr,search);
		System.out.println(index);
		int arr1[]= {10,20,40,60,5,8};
		System.out.println(searchSortedRotated(arr1, 5));
	}

	private static int searchSortedRotated(int[] arr, int search) {
		int low=0;
		int high=arr.length-1;
		
		while(low<=high){
			int mid=(low+high)/2;
			if(arr[mid]==search)
				return mid;
			
			//left array is sorted
			if(arr[low]<arr[mid]) {
				if(search>=arr[low] && search <arr[mid])
					high=mid-1;
				else
					low=mid+1;
			}else {//right array is sorted
				if(search>arr[mid] && search<= arr[high])
					low=mid+1;
				else
					high=mid-1;
			}
			
		}
		return -1;
	}
}

//o(logn)
//o(1)