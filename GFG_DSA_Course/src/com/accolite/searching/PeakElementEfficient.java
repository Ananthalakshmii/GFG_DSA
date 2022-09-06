package com.accolite.searching;

public class PeakElementEfficient {
	public static void main(String[] args) {
		int[] arr= {13,20,12,25,30,24};
		int peak=getPeak(arr);
		System.out.println(peak);
	}

	private static int getPeak(int[] arr) {
		int len=arr.length;
		int low=0;
		int high=len-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if((mid==0 || arr[mid]>=arr[mid-1]) && (mid==len-1 || arr[mid]>=arr[mid+1]))
				return arr[mid];
			if(mid<len-1 && arr[mid]>arr[mid+1]) //if left side element is greater, it is guaranteed that left subarray will contain a peak, so considering only left subarray
				//it should be ---- if(mid>0 && arr[mid-1]>arr[mid])
				high=mid-1;
			else
				low=mid+1;
		}
		return -1;
	}

}
