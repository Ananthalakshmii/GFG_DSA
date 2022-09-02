package com.accolite.arrays;

import java.util.ArrayList;

public class _Problem20_StockBuyAndSell {
	public static void main(String[] args) {
		int n=7;
		int[] arr={100,180,260,310,40,535,695};
		ArrayList<ArrayList<Integer>> list=stockBuyAndSell(arr,n);
			System.out.println(list);
		int[] arr1= {4, 3, 2, 1};
		ArrayList<ArrayList<Integer>> list1=stockBuyAndSell(arr1,4);
		System.out.println(list1);
		
	}

	private static ArrayList<ArrayList<Integer>> stockBuyAndSell(int[] arr, int n) {
		ArrayList<ArrayList<Integer>> arraylist=new ArrayList<>();
		ArrayList<Integer> list;
		
		int min=0;
		int max=0;
		int profit=0;
		int count=0;
		
		for(int i=0;i<n-1;i++) {
			if(arr[i]>arr[i+1]) {
				count++;
			}
		}
		if(count==n-1)
			return arraylist;
		
		for(int i=1;i<n;i++) {
			if(arr[i]>arr[i-1]) {
				profit+=arr[i]-arr[i-1];
			}else if(arr[i]<arr[i-1]) {
				max=i-1;
				list=new ArrayList<>();
				list.add(min);
				list.add(max);
				arraylist.add(list);
				min=i;
			}
			if(i==n-1){
				max=n-1;
				list=new ArrayList<>();
				list.add(min);
				list.add(max);
				arraylist.add(list);
			}
		}
		
		return arraylist;
	}

}
