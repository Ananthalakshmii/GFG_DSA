package com.accolite.searching;

//unsorted array- find the element that is larger than the neighbours
public class PeakElementNaive {

	public static void main(String[] args) {
		int[] arr= {13,20,12,25,30,24};
		int peak=getPeak(arr);
		System.out.println(peak);
	}

	private static int getPeak(int[] arr) {
		int len=arr.length;
		if(len==1)
			return arr[0];
		if(arr[0]>arr[1])
			return arr[0];
		if(arr[len-2]<arr[len-1])
			return arr[len-1];
		for(int i=1;i<len-1;i++) {
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
				return arr[i];
		}
		return -1;
	}
}

//o(n)