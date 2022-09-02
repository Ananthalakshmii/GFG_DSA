package com.accolite.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class _Problem7_ReverseArraysInGroups {
	public static void main(String[] args) {
		int N = 5, K = 3;
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		 reverseInGroups( arr,N,  K);
		 System.out.println(arr);
	}

	private static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
		for(int i=0;i<n;i+=k) {
			int left=i;
			int right=Math.min(n-1, i+k-1);
			while(left<right) {
				Collections.swap(arr, left, right);
				left++;
				right--;
			}
		}
	}

}
