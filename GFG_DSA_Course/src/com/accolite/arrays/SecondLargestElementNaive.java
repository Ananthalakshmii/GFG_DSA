package com.accolite.arrays;

public class SecondLargestElementNaive {
	
	public static void main(String[] args) {
		int[] arr= {5,8,20,10};
		int index=getSecondLargest(arr);
		System.out.println(index);
		int[] arr1={20,10,20,8,12};
		System.out.println(getSecondLargest(arr1));
		int[] arr2= {10,10,10};
		System.out.println(getSecondLargest(arr2));
	}

	private static int getSecondLargest(int[] arr) {
		int largest=getLargest(arr);
		int res=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=arr[largest]) {
				if(res==-1)
					res=i;
				else if(arr[i]>arr[res])
					res=i;
			}
		}
		return res;
	}

	private static int getLargest(int[] arr) {
		int res=0;
		for(int i=1;i<arr.length;i++)
			if(arr[i]>arr[res])
				res=i;
		return res;
	}


}

//O(n)
