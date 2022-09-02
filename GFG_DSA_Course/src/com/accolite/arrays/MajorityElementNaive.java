package com.accolite.arrays;

public class MajorityElementNaive { //appears more than n/2 times
	public static void main(String[] args) {
		int[] arr= {8,3,4,8,8};
		int index=majorityElement(arr);
		System.out.println(index);
	}

	private static int majorityElement(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=1;j<arr.length;j++) {
				if(arr[i]==arr[j])
					count++;
			}
			if(count>(arr.length/2))
				return i;
		}
		return -1;
	}

}

//o(n^2)