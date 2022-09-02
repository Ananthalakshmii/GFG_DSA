package com.accolite.arrays;

public class RemoveDuplicatesFromSortedArrayNaive {
	public static void main(String[] args) {
		int[] arr= {10,20,20,30,30,30,30,30};
		removeDuplicates(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

	private static void removeDuplicates(int[] arr) {
		int size=0;
		int[] temp=new int[arr.length];
		temp[0]=arr[0];
		size++;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=temp[size-1]) {
				temp[size]=arr[i];
				size++;
			}
		}
		
		for(int i=0;i<temp.length;i++) {
			arr[i]=temp[i];
		}
		
	}

}


//o(n)
//aux space - o(n)