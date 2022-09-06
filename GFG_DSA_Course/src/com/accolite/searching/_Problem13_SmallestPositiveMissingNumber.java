package com.accolite.searching;

public class _Problem13_SmallestPositiveMissingNumber {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int missing=missingNumber(arr,5);
		System.out.println(missing);
	}

	private static int missingNumber(int[] arr, int size) {
		// checking if there is 1
		int num=0;
		for(int i=0;i<size;i++)
			if(arr[i]==1) {
				num=1;
				break;
			}
		if(num==0)
			return 1;
		
		//eliminating negative numbers
		for(int i=0;i<size;i++)
			if(arr[i]<=0 || arr[i]>size)
				arr[i]=1;
		
		//updating indices
		for(int i=0;i<size;i++)
			arr[(arr[i]-1)%size]+=size;
		
		//checking for indices whose value is less than size
		for(int i=0;i<size;i++)
			if(arr[i] <= size)
				return i+1;
		
		return size+1;
	}

}
