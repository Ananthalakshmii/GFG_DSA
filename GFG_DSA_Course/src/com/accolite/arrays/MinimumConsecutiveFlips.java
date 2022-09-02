package com.accolite.arrays;

// given a binary input array, flip a group of 0's or 1's so that array elements are same.
// flips should be minimum
// u can flip an entire group at one time

public class MinimumConsecutiveFlips {
	public static void main(String[] args) {
		int[] arr= {1,1,0,0,0,1};
		minConsecutiveFlips(arr);
		System.out.println("second ouput");
		int[] arr1= {0,0,1,1,0,0,1,1,0,1};
		minConsecutiveFlips(arr1);
	}

	private static void minConsecutiveFlips(int[] arr) {
		// there are only 2 possibilities for flipping
		//-> 1. either flipping difference will be one [0's flipping require x flips and 1's require x+1 flips or vice versa]
		//->2. both the flips results in same number of flips [0's flip also takes x flips or 1's flip also takes x flips]
		// which means-> flip every second batch of elements
		
		for(int i=1;i<arr.length-1;i++) {
			if(arr[i]!=arr[i-1]) {
				if(arr[i]!=arr[0]) 
					System.out.print("from "+i);
				else 
					System.out.println(" to "+(i-1));
			}
		}
		
		if(arr[arr.length-1]!=arr[0])
			System.out.println(arr.length-1);
		
	}

}


//0(n)