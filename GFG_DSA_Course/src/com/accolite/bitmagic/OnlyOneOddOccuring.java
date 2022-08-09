package com.accolite.bitmagic;

public class OnlyOneOddOccuring {
	public static void main(String[] args) {
		int[] arr= {4,3,4,4,4,5,5};
		int result=oddOccuring(arr);
		System.out.println(result);
	}

	private static int oddOccuring(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j])
					count++;
			}
			if(count%2 !=0)
				return arr[i];
		}
		return -1;
	}

}

//O(n^2)