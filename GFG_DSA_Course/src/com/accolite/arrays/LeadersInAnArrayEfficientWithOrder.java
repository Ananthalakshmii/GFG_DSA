package com.accolite.arrays;

public class LeadersInAnArrayEfficientWithOrder { // will print the leaders from right to left
	public static void main(String[] args) { 
		int[] arr= {7,10,4,3,6,5,2};
		printLeaders(arr);
	}

	private static void printLeaders(int[] arr) {
		int[] result=new int[arr.length];
		int resultCounter=0;
		
		int current_leader=arr[arr.length-1];
		result[resultCounter++]=current_leader;
		
		for(int i=arr.length-2;i>=0;i--) {
			if(current_leader<arr[i]) {
				current_leader=arr[i];
				result[resultCounter++]=current_leader;
			}
		}
		
		int low=0,high=result.length-1;
		while(low<high) {
			swap(result,low,high);
			low++;
			high--;
		}
		
		for(int i=0;i<result.length;i++)
			if(result[i]!=0)
				System.out.print(result[i]+" ");
	}

	private static void swap(int[] result, int low, int high) {
		int temp=result[low];
		result[low]=result[high];
		result[high]=temp;
	}
}

//theta(n)
//theta(n) aux space