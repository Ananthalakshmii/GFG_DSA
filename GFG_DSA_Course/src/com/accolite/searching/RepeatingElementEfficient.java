package com.accolite.searching;

/*
 array size, n>=2
 every element occurs only once
 only 1 element repeats any no of times
 max(arr)-- all the elements from 0 to max(arr) are present
 0<=max(arr)<=n-2
 
 1. super naive: run 2 loops, for every element check for every other element -> o(n^2)
 2. naive: o(nlogn) - sort the array and check with next consecutive ele --modifies the original array which is not allowed
 3.efficient: o(n) time complexity and o(n) space complexity
 4. super efficient: o(n) time ,o(1) space and no modifications to original array
 */
public class RepeatingElementEfficient {
	public static void main(String[] args) {
		int[] arr= {0,2,1,3,2,2};
		int repeating=repeatingElement(arr);
		System.out.println(repeating);
	}

	private static int repeatingElement(int[] arr) {
		boolean[] mark=new boolean[arr.length];
		for(int i=0;i<arr.length;i++) {
			mark[i]=false;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(mark[arr[i]])
				return arr[i];
			else
				mark[arr[i]]=true;
		}
		return 0;
	}

}


//o(n)
//o(n) space complexity