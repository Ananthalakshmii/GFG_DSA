package com.accolite.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class _Problem14_LeadersInAnArray {
	public static void main(String[] args) {
		int n = 7;
		int arr[] = {16,17,4,3,5,5,2};
		ArrayList<Integer> list=leaders(arr,n);
		System.out.println(list);
	}

	private static ArrayList<Integer> leaders(int[] arr, int n) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(arr[n-1]);
		int current_max=arr[n-1];
		for(int i=n-2;i>=0;i--) {
			if(arr[i]>=current_max) {
				list.add(arr[i]);
				current_max=arr[i];
			}
		}
		Collections.reverse(list);
		return list;
	}

}
