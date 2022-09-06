package com.accolite.searching;

import java.util.ArrayList;

public class _Problem17_SubarrayWithGivenSum {
	public static void main(String[] args) {
		int[] arr={1,2,3,7,5};
		ArrayList<Integer> list=subarraySum(arr,5,12);
		System.out.println(list);
		int[] arr1={1,2,3,4,5,6,7,8,9,10};
		System.out.println(subarraySum(arr1, 10, 15));
	}

	private static ArrayList<Integer> subarraySum(int[] arr, int len, int sum) {
		int start=0;
		int curSum=0;
		ArrayList<Integer> list=new ArrayList<>();
		
		for(int i=0;i<len;i++) {
			curSum=curSum+arr[i];
			while(curSum>sum) {
				curSum=curSum-arr[start++];
			}
			if(curSum==sum && (i>=start)) {
				list.add(start+1);
				list.add(i+1);
				return list;
			}
				 
		}
		list.add(-1);
		return list;
	}

}
