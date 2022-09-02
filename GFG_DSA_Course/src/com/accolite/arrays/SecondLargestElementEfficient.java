package com.accolite.arrays;

public class SecondLargestElementEfficient {
	public static void main(String[] args) {
		int[] arr= {5,8,20,10};
		int index=getSecondLargest(arr);
		System.out.println(index);
		int[] arr1={20,10,20,8,12};
		System.out.println(getSecondLargest(arr1));
		int[] arr2= {10,10,10};
		System.out.println(getSecondLargest(arr2));
	}

	private static int getSecondLargest(int[] arr) {
		int secLargest=-1,largest=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>arr[largest]) {
				secLargest=largest;
				largest=i;
			}
			else if(arr[i] != arr[largest]) {
				if(secLargest==-1 || arr[i]>arr[secLargest])
					secLargest=i;
			}
				
		}
		return secLargest;
	}

}

//theta(n)
//aux space- theta(1)