package com.accolite.arrays;

import java.util.List;

//given n ranges, find the max appearing element in the ranges , left[i] and right[i] in the range 0 to 1000

public class PrefixSumRanges {
	public static void main(String[] args) {
		int[] left= {1,2,5,15};
		int[] right= {5,8,7,18};
		int index=maxAppearingElement(left,right);
		System.out.println(index);
	}

	private static int maxAppearingElement(int[] left, int[] right) {
		int[] arr=new int[1000];
		for(int i=0;i<left.length;i++) {
			arr[left[i]]++; // arr[]={0,1,1,0,0,1,0,0,0,0,0,0,0,0,0,1,...}
			arr[right[i]+1]--; // arr[]={0,1,1,0,0,1,-1,-1,-1,0,0,0,0,0,0,1,0,0,0,-1...}
		}
		int max=arr[0];
		int resultIndex=0;
		for(int i=1;i<1000;i++) {
			arr[i]=arr[i]+arr[i-1]; //prefix array ---- arr[]={0,1,2,2,2,3,2,1,0,0,0,0,0,0,0,1,1,1,1,0...}
			if(max<arr[i]) {
				max=arr[i];
				resultIndex=i;
			}
		}
		return resultIndex;
	}

}
