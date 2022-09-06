package com.accolite.searching;

import java.util.Arrays;

public class MedianOf2SortedArraysNaive {
	public static void main(String[] args) {
		int[] arr1= {10,20,30,40,50};
		int[] arr2= {5,15,25,35,45};
		double mean=mean(arr1,arr2);
		System.out.println(mean);
	}

	private static double mean(int[] arr1, int[] arr2) {
		int[] temp=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++)
			temp[i]=arr1[i];
		for(int i=0;i<arr2.length;i++)
			temp[arr1.length+i]=arr2[i];
		Arrays.sort(temp);
		int len=temp.length;
		if(temp.length %2 !=0)
			return temp[temp.length/2];
		else {
			int mid=temp.length/2;
			double mean=(temp[mid]+temp[mid-1])/2.0;
			return mean;
		}
	}

}

//o((n1+n2)log(n1+n2)