package com.accolite.searching;

public class _Problem18_MedianOf2SortedArrays {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int brr[] = {3,4,5,6,7,8};
		int median=findMedian(arr,5,brr,6);
		System.out.println(median);
	}

	private static int findMedian(int[] arr1, int len1, int[] arr2, int len2) {
		
		int low=0;
		int high=len1;
		while(low<=high) {
		
		int mid1=(low+high)/2;
		int mid2=(len1+len2+1)/2-mid1;
			
		int maxleft1=(mid1==0)?Integer.MIN_VALUE:arr1[mid1-1];
		int minright1=(mid1==(len1))?Integer.MAX_VALUE:arr1[mid1]; //partition is at mid
		
		int maxleft2=arr2[mid2-1];
		int minright2=arr2[mid2];
		
		if((maxleft1<=minright2) && (maxleft2<=minright1)) {
			if((len1+len2)%2==0)
				return (Math.max(maxleft1, maxleft2)+Math.min(minright1, minright2))/2;
			else
				return Math.max(maxleft1, maxleft2);
		}
		else {
			if(maxleft1>minright2)
				high=mid1-1;
			else
				low=mid1+1;
		}
		
		}
		return -1;
	}

}
