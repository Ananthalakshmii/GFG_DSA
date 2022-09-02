package com.accolite.arrays;

import java.util.Arrays;

public class _Problem18_MaximumIndex {
	public static void main(String[] args) {
		int N = 9;
		int arr[] = {34, 8, 10, 3, 2, 80, 30, 33, 1};
		int maxDiff=maxIndexDiff(arr,N);
		System.out.println(maxDiff);
	}

	private static int maxIndexDiff(int[] arr, int n) {
		int[] leftMin=new int[n];
		leftMin[0]=arr[0];
		for(int i=1;i<n;i++)
			leftMin[i]=Math.min(leftMin[i-1], arr[i]);
		
		//arr[i]= {34, 8, 10, 3, 2, 80, 30, 33, 1};
		//leftMin[i]={34,8,8,3,2,2,2,2,1};
		
		int maxDist=Integer.MIN_VALUE;
		int leftMinIndex=n-1,arrIndex=n-1;
		while(leftMinIndex>=0 && arrIndex>=0) {
			if(arr[arrIndex]>=leftMin[leftMinIndex]) {
				System.out.println(maxDist+" "+arrIndex+" "+leftMinIndex);
				maxDist=Math.max(maxDist, arrIndex-leftMinIndex);
				leftMinIndex--;
			}else
				arrIndex--;
		}
		return maxDist;
	}

}
