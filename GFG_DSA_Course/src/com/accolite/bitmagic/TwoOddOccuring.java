package com.accolite.bitmagic;

public class TwoOddOccuring {
	public static void main(String[] args) {
		int[] arr= {3,4,3,4,5,4,4,6,7,7};
		twoOddOccuring(arr);
	}

	private static void twoOddOccuring(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j])
					count++;
			}
			if(count%2 !=0)
				System.out.println(arr[i]);
		}
		
	}

}


//theta(n^2)