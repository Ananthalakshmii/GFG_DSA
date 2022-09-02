package com.accolite.arrays;

public class FrequenciesInASortedArray {
	public static void main(String[] args) {
		int[] arr= {10,10,10,25,30,30};
		frequenciesInASortedArray(arr);
	}

	private static void frequenciesInASortedArray(int[] arr) {
		int frequency=1,i=1;
		while(i<arr.length) {
			while(i<arr.length && arr[i-1]==arr[i]) {
				frequency++;
				i++;
			}
			System.out.println(arr[i-1]+" "+frequency);
			i++;
			frequency=1;
		}
		if(arr.length==1 || arr[arr.length-1]!=arr[arr.length-2])
			System.out.println(arr[arr.length-1]+" "+1);
	}

}


//theta(n)