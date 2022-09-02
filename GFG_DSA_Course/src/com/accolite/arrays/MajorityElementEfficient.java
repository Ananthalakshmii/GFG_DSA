package com.accolite.arrays;

public class MajorityElementEfficient { //moore's voting algorithm
	
	public static void main(String[] args) {
		int[] arr= {8,3,4,8,8};
		int index=majorityElement(arr);
		System.out.println(index);
		int[] arr1= {6,8,4,8,8};
		System.out.println(majorityElement(arr1));
	}

	private static int majorityElement(int[] arr) {
		// first phase - choosing a candidate as majority element
		int result=0;
		int count=1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==arr[result])
				count++;
			else
				count--;
			if(count==0) {
				result=i;
				count=1;
			}
		}
		
		//second phase- to check if the chosen candidate is majority or not-> occurs when there is no majority element in the array
		
		count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==arr[result])
				count++;
		}
		if(count>(arr.length/2))
			return result;
		else
			return -1;
	}

}


//theta(n)