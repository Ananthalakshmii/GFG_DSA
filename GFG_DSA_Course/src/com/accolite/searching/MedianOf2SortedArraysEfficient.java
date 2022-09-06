package com.accolite.searching;

public class MedianOf2SortedArraysEfficient {
	public static void main(String[] args) {
		int[] arr1= {10,20,30,40,50};
		int[] arr2= {5,15,25,30,35,55,65,75,85};
		double mean=mean(arr1,arr2);
		System.out.println(mean);
	}

	private static double mean(int[] arr1, int[] arr2) {//finding a position where equal ele on right and equal ele on left
		//doing binary search on first array
		//max from left sub array and min from right subarray - median
		int len1=arr1.length;
		int len2=arr2.length;
		int low=0;
		int high=len1;
		while(low<=high) {
			int mid1=(low+high)/2;
			int mid2=(len1+len2+1)/2 - mid1; //formula
			
			int minright1=(mid1==len1)?Integer.MAX_VALUE:arr1[mid1]; //if first array has only 2 elements
			int maxleft1=(mid1==0)?Integer.MIN_VALUE:arr1[mid1-1]; //if arr1 has only 1 element
			
			int minright2=arr2[mid2];
			int maxleft2=arr2[mid2-1];
			
			if(maxleft1<=minright2 && maxleft2<=minright1)
				return (Math.max(maxleft1, maxleft2)+Math.min(minright1, minright2))/2.0;
			else //REFER PROBLEM 18 for CORRECT SOLUTION
				//return (double)Math.max(maxleft1,maxleft2); ??????????????????????????? what it serves??????????????????????????????????????????????
				if(maxleft1>minright2)
					high=mid1-1;
				else
					low=mid1+1;
			
		}
		return 0;
	}

}

//o(logn1) where n1<=n2
