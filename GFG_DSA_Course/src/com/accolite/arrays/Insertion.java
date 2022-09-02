package com.accolite.arrays;

public class Insertion {
	public static void main(String[] args) {
		int[] arr=new int[5];
		arr[0]=5;
		arr[1]=10;
		arr[2]=20;
		int pos=2;
		int ins=7;
		int res=search(arr,pos,ins,3,arr.length);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		System.out.println(res);
	}

	private static int search(int[] arr, int pos, int ins,int length,int capacity) {
		if(length==capacity)
			return length;
		for(int i=length+1;i>=pos;i--)
			arr[i]=arr[i-1];
		arr[pos]=ins;
		return length+1;
	}

}

//O(n)
//insertion into AL at the end is O(1) or theta(n)