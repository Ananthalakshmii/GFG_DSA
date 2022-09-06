package com.accolite.searching;

//the first element of the cycle will always be the repeating element
//loop in a linked list similar
//2 phases
public class RepeatingElementSuperEfficient {
	public static void main(String[] args) {
		int[] arr= {0,2,1,3,5,4,6,2};
		int repeating=repeatingElement(arr);
		System.out.println(repeating);
	}

	private static int repeatingElement(int[] arr) {
		//because smallest array ele is 0 and we increment 1 to avoid unnecessary cycle 
		//when there is 1 ele in array and is 0 - it will form self cycle
		// when there are elements like 1,0,.... - it will form cycle bwn 1 and 0
		//to avoid that we consider incrementing array ele by 1 and checking
		
		//PHASE 1 -- finding the meeting point inside the loop
		//moving slow pointer one step and fast pointer by 2 steps and exiting when they meet
		int slow=arr[0]+1;
		int fast=arr[0]+1;
		do {
			slow=arr[slow]+1;
			fast=arr[arr[fast]+1]+1;
		}while(slow!=fast);
		
		//PHASE 2 -- checking for the repeating element
		// re-initializing slow to first ele in the array
		//moving slow and fast one step at a time to find the repeating ele
		//return ele-1 becoz the ele considered was 1 greater
		slow=arr[0]+1;
		while(slow!=fast) {
			slow=arr[slow]+1;
			fast=arr[fast]+1;
		}
		
		return slow-1;
	}

}
