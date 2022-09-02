package com.accolite.arrays;

public class RemoveDuplicatesFromSortedArrayEfficient {
	public static void main(String[] args) {
		int[] arr= {10,20,20,30,30,30,30,30};
		int size=removeDuplicates(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		System.out.println(size);
	}

	private static int removeDuplicates(int[] arr) {
		int size=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[size-1]!=arr[i]) {
				arr[size]=arr[i];
				size++;
			}
				
		}
		return size;
		
	}

}


//o(n)
//aux space - o(1)